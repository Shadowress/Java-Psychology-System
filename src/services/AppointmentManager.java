package services;

import datastorage.FileManager;
import entities.Appointment;
import entities.AppointmentStatus;
import entities.Slot;
import entities.UserType;
import entities.Users;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class AppointmentManager {

    public static void makeAppointment(int studentID, int slotID) {
        for (Appointment appointment : FileManager.getAppointments().values()) {
            if (appointment.getStudentID() == studentID && appointment.getStatus() == AppointmentStatus.SCHEDULED) {
                JOptionPane.showMessageDialog(null, "You cannot have multiple appointments booked at the same time", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        FileManager.addNewAppointment(studentID, slotID);
    }

    public static List<String[]> getUserAppointments(int userID) {
        Map<Integer, Appointment> appointments = FileManager.getAppointments();
        Map<Integer, Slot> slots = FileManager.getSlots();
        Map<Integer, Users> users = FileManager.getUsers();

        LocalDateTime now = LocalDateTime.now();
        UserType userType = users.get(userID).getUserType();
        List<String[]> userAppointments = new ArrayList<>();

        // Type(Upcoming/Past), Lecturer/Student,Date, Time, Status 
        for (Appointment appointment : appointments.values()) {
            String type = slots.get(appointment.getSlotID()).getDate().atTime(slots.get(appointment.getSlotID()).getTime()).isAfter(now) ? "Upcoming" : "Past";
            String lecturerOrStudentName = null;
            String slotDate = slots.get(appointment.getSlotID()).getDate().toString();
            String slotTime = slots.get(appointment.getSlotID()).getTime().toString();
            String status = appointment.getStatus().name().toLowerCase().replace("_", " ");

            if (userType == UserType.STUDENT) {
                lecturerOrStudentName = users.get(slots.get(appointment.getSlotID()).getLecturerID()).getUsername();
            } else if (userType == UserType.LECTURER) {
                lecturerOrStudentName = users.get(appointment.getStudentID()).getUsername();
            }
            userAppointments.add(new String[]{type, lecturerOrStudentName, slotDate, slotTime, status});
        }
        return userAppointments;
    }
}
