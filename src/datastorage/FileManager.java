package datastorage;

import entities.Appointment;
import entities.AppointmentStatus;
import entities.Feedback;
import entities.Lecturer;
import entities.Slot;
import entities.Student;
import entities.UserType;
import entities.Users;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import userinterface.StartUpUI;

public class FileManager {

    private static final Map<Integer, Users> users = new HashMap<>();
    private static final Map<Integer, Appointment> appointments = new HashMap<>();
    private static final Map<Integer, Slot> slots = new HashMap<>();
    private static final Map<Integer, Feedback> feedbacks = new HashMap<>();

    public static void processFiles(StartUpUI startUpUI, Runnable onLoadingCompleteCallback) {
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            @Override
            @SuppressWarnings("SleepWhileInLoop")
            protected Void doInBackground() throws Exception {
                for (StartupFileResource fileResource : StartupFileResource.values()) {                    
                    publish("Initializing " + fileResource.toString().toLowerCase());
                    initializeFile(fileResource.getFilePath(), fileResource.getFileHeader());
                    fileResource.getLoader().run();

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }                    
                }

                return null;
            }

            @Override
            protected void process(java.util.List<String> chunks) {
                for (String message : chunks) {
                    SwingUtilities.invokeLater(() -> startUpUI.updateLoadingLabel(message));
                }
            }

            @Override
            protected void done() {
                if (onLoadingCompleteCallback != null) {
                    onLoadingCompleteCallback.run();
                }
            }
        };

        worker.execute();
    }

    private static void initializeFile(String filePath, String fileHeader) {
        File file = new File(filePath);

        try {
            if (file.createNewFile()) {
                try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                    writer.println(fileHeader);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,
                            String.format("Error initializing %s: %s. Check if the file is accessible and writable.", file.getName(), e.getMessage()),
                            "File Initialization Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    String.format("Error creating %s: %s. Check if the file is accessible and writable.", file.getName(), e.getMessage()),
                    "File Creation Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Get single object
    public static Users getUser(int userID) {
        return users.get(userID);
    }

    public static Appointment getAppointment(int appointmentID) {
        return appointments.get(appointmentID);
    }

    public static Slot getSlot(int slotID) {
        return slots.get(slotID);
    }

    public static Feedback getFeedback(int feedbackID) {
        return feedbacks.get(feedbackID);
    }

    // Get map of objects
    public static Map<Integer, Users> getUsers() {
        return new HashMap<>(users);
    }

    public static Map<Integer, Appointment> getAppointments() {
        return new HashMap<>(appointments);
    }

    public static Map<Integer, Slot> getSlots() {
        return new HashMap<>(slots);
    }

    public static Map<Integer, Feedback> getFeedbacks() {
        return new HashMap<>(feedbacks);
    }

    // Get ID from details
    public static int getUserIDFromUsername(String username) {
        for (Users user : users.values()) {
            if (user.getUsername().equals(username)) {
                return user.getUserID();
            }
        }
        return 0;
    }

    public static int getAppointmentIDFromSlotID(int slotID) {
        for (Appointment appointment : appointments.values()) {
            if (appointment.getSlotID() == slotID && appointment.getStatus() != AppointmentStatus.CANCELLED) {
                return appointment.getAppointmentID();
            }
        }
        return 0;
    }

    public static int getSlotIDFromSlotDetails(int lecturerID, LocalDate date, LocalTime time) {
        for (Slot slot : slots.values()) {
            if (slot.getLecturerID() == lecturerID && slot.getDate().equals(date) && slot.getTime().equals(time)) {
                return slot.getSlotID();
            }
        }
        return 0;
    }

    public static int getFeedbackIDFromAppointmentID(int appointmentID) {
        for (Feedback feedback : feedbacks.values()) {
            if (appointmentID == feedback.getAppointmentID()) {
                return feedback.getFeedbackID();
            }
        }
        return 0;
    }

    public static void addUserToCode(int userID, Users user) {
        users.put(userID, user);
    }

    public static void addAppointmentToCode(int appointmentID, Appointment appointment) {
        appointments.put(appointmentID, appointment);
    }

    public static void addSlotToCode(int slotID, Slot slot) {
        slots.put(slotID, slot);
    }

    public static void addFeedbackToCode(int feedbackID, Feedback feedback) {
        feedbacks.put(feedbackID, feedback);
    }

    public static void addNewUser(String username, String password, UserType userType) {
        int userID = getNextID(users);

        if (userType == UserType.STUDENT) {
            users.put(userID, new Student(userID, username, password));
        } else if (userType == UserType.LECTURER) {
            users.put(userID, new Lecturer(userID, username, password));
        }

        FileWriterAppender.appendUser(users.get(userID));
    }

    public static void addNewAppointment(int studentID, int slotID) {
        int appointmentID = getNextID(appointments);

        appointments.put(appointmentID, new Appointment(appointmentID, studentID, slotID, AppointmentStatus.SCHEDULED, -1));
        FileWriterAppender.appendAppointment(appointments.get(appointmentID));
    }

    public static void addNewSlot(int lecturerID, LocalDate date, LocalTime time) {
        int slotID = getNextID(slots);

        slots.put(slotID, new Slot(slotID, lecturerID, date, time));
        FileWriterAppender.appendSlot(slots.get(slotID));
    }

    public static void addNewFeedback(int appointmentID, int rating, String studentComment, String lecturerComment) {
        int feedbackID = getNextID(feedbacks);

        feedbacks.put(feedbackID, new Feedback(feedbackID, appointmentID, rating, studentComment, lecturerComment));
        FileWriterAppender.appendFeedback(feedbacks.get(feedbackID));
    }

    public static int getNextID(Map<Integer, ?> map) {
        return map == null || map.isEmpty() ? 1 : map.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
    }
}
