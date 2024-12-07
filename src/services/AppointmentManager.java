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
import userinterface.StudentBookConsultation;
import userinterface.StudentDashboard;

public class AppointmentManager {

    public static void makeAppointment(StudentBookConsultation UI, int studentID, int slotID) {
        for (Appointment appointment : FileManager.getAppointments().values()) {
            if (appointment.getStudentID() == studentID && appointment.getStatus() == AppointmentStatus.SCHEDULED) {
                JOptionPane.showMessageDialog(null, "You cannot have multiple appointments booked at the same time", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        FileManager.addNewAppointment(studentID, slotID);
        JOptionPane.showMessageDialog(null, "Your appointment has been successfully booked!", "Appointment Bookiing Successful", JOptionPane.INFORMATION_MESSAGE);

        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        UI.dispose();
    }

    public static List<String[]> getUserPastAppointments(int userID) {
        Map<Integer, Appointment> appointments = FileManager.getAppointments();
        Map<Integer, Slot> slots = FileManager.getSlots();
        Map<Integer, Users> users = FileManager.getUsers();

        LocalDateTime now = LocalDateTime.now();
        UserType userType = users.get(userID).getUserType();

        List<String[]> userAppointments = new ArrayList<>();

        for (Appointment appointment : appointments.values()) {
            LocalDateTime slotDateTime = LocalDateTime.of(slots.get(appointment.getSlotID()).getDate(), slots.get(appointment.getSlotID()).getTime());

            if (userType == UserType.STUDENT && appointment.getStudentID() != userID) {
                continue;
            }

            if (userType == UserType.LECTURER && slots.get(appointment.getSlotID()).getLecturerID() != userID) {
                continue;
            }

            if (slotDateTime.isBefore(now)) {
                String lecturerOrStudentName = null;
                String slotDate = slots.get(appointment.getSlotID()).getDate().toString();
                String slotTime = slots.get(appointment.getSlotID()).getTime().toString();
                String status = appointment.getStatus().name().toLowerCase().replace("_", " ");

                if (userType == UserType.STUDENT) {
                    lecturerOrStudentName = users.get(slots.get(appointment.getSlotID()).getLecturerID()).getUsername();
                } else if (userType == UserType.LECTURER) {
                    lecturerOrStudentName = users.get(appointment.getStudentID()).getUsername();
                }
                userAppointments.add(new String[]{lecturerOrStudentName, slotDate, slotTime, status});
            }
        }
        return userAppointments;
    }

    public static List<String[]> getUserUpcomingAppointments(int userID) {
        Map<Integer, Appointment> appointments = FileManager.getAppointments();
        Map<Integer, Slot> slots = FileManager.getSlots();
        Map<Integer, Users> users = FileManager.getUsers();

        LocalDateTime now = LocalDateTime.now();
        UserType userType = users.get(userID).getUserType();

        List<String[]> userAppointments = new ArrayList<>();

        for (Appointment appointment : appointments.values()) {
            LocalDateTime slotDateTime = LocalDateTime.of(slots.get(appointment.getSlotID()).getDate(), slots.get(appointment.getSlotID()).getTime());

            if (userType == UserType.STUDENT && appointment.getStudentID() != userID) {
                continue;
            }

            if (userType == UserType.LECTURER && slots.get(appointment.getSlotID()).getLecturerID() != userID) {
                continue;
            }

            if (slotDateTime.isAfter(now)) {
                String lecturerOrStudentName = null;
                String slotDate = slots.get(appointment.getSlotID()).getDate().toString();
                String slotTime = slots.get(appointment.getSlotID()).getTime().toString();
                String status = appointment.getStatus().name().toLowerCase().replace("_", " ");

                if (userType == UserType.STUDENT) {
                    lecturerOrStudentName = users.get(slots.get(appointment.getSlotID()).getLecturerID()).getUsername();
                } else if (userType == UserType.LECTURER) {
                    lecturerOrStudentName = users.get(appointment.getStudentID()).getUsername();
                }
                userAppointments.add(new String[]{lecturerOrStudentName, slotDate, slotTime, status});
            }
        }
        return userAppointments;
    }
}
