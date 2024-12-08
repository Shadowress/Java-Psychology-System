package services;

import datastorage.FileManager;
import entities.Appointment;
import entities.AppointmentStatus;
import entities.Slot;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SlotManager {

    public static List<String[]> getAvailableLecturerSlots(int userID) {
        Map<Integer, Appointment> appointments = FileManager.getAppointments();
        Map<Integer, Slot> slots = FileManager.getSlots();

        LocalDate today = LocalDate.now();
        List<String[]> lecturerSlots = new ArrayList<>();

        for (Slot slot : slots.values()) {
            if (slot.getLecturerID() == userID) {
                if (!slot.getDate().isAfter(today)) {
                    continue;
                }

                boolean isAvailable = true;

                for (Appointment appointment : appointments.values()) {
                    if (slot.getSlotID() == appointment.getSlotID() && appointment.getStatus() != AppointmentStatus.CANCELLED) {
                        isAvailable = false;
                        break;
                    }

                    if (slot.getSlotID() == appointment.getRescheduleSlotID()) {
                        isAvailable = false;
                        break;
                    }
                }

                if (isAvailable) {
                    lecturerSlots.add(new String[]{slot.getDate().toString(), slot.getTime().toString()});
                }
            }
        }
        return lecturerSlots;
    }

    public static boolean isSlotAlreadySet(int lecturerID, LocalDate date, LocalTime time) {
        for (Slot slot : FileManager.getSlots().values()) {
            if (slot.getLecturerID() == lecturerID && slot.getDate().equals(date) && slot.getTime().equals(time)) {
                return true;
            }
        }
        return false;
    }
}
