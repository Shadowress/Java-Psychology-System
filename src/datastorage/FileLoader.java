package datastorage;

import static datastorage.StartupFileResource.APPOINTMENTS;
import static datastorage.StartupFileResource.FEEDBACKS;
import static datastorage.StartupFileResource.SLOTS;
import static datastorage.StartupFileResource.USERS;
import entities.Appointment;
import entities.AppointmentStatus;
import entities.Feedback;
import entities.Lecturer;
import entities.Slot;
import entities.Student;
import entities.UserType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class FileLoader {

    public static void loadUsers() {
        File file = new File(USERS.getFilePath());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");

                if (userData.length == 4) {
                    int userID = Integer.parseInt(userData[0].trim());
                    String username = userData[1].trim();
                    String password = userData[2].trim();
                    String userType = userData[3].trim().toUpperCase();

                    if (UserType.STUDENT.name().equals(userType)) {
                        FileManager.addUserToCode(userID, new Student(userID, username, password));
                    } else if (UserType.LECTURER.name().equals(userType)) {
                        FileManager.addUserToCode(userID, new Lecturer(userID, username, password));
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error loading " + file.getName() + " file: " + e.getMessage(),
                    "File Load Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void loadAppointments() {
        File file = new File(APPOINTMENTS.getFilePath());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] appointmentData = line.split(",");

                if (appointmentData.length == 5) {
                    int appointmentID = Integer.parseInt(appointmentData[0].trim());
                    int studentID = Integer.parseInt(appointmentData[1].trim());
                    int slotID = Integer.parseInt(appointmentData[2].trim());
                    AppointmentStatus status = AppointmentStatus.valueOf(appointmentData[3].trim().toUpperCase());
                    int rescheduleSlotID = Integer.parseInt(appointmentData[4].trim());

                    FileManager.addAppointmentToCode(appointmentID, new Appointment(appointmentID, studentID, slotID, status, rescheduleSlotID));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error loading " + file.getName() + " file: " + e.getMessage(),
                    "File Load Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void loadSlots() {
        File file = new File(SLOTS.getFilePath());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] slotData = line.split(",");

                if (slotData.length == 4) {
                    int slotID = Integer.parseInt(slotData[0].trim());
                    int lecturerID = Integer.parseInt(slotData[1].trim());
                    LocalDate date = LocalDate.parse(slotData[2].trim());
                    LocalTime time = LocalTime.parse(slotData[3].trim());

                    FileManager.addSlotToCode(slotID, new Slot(slotID, lecturerID, date, time));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error loading " + file.getName() + " file: " + e.getMessage(),
                    "File Load Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void loadFeedbacks() {
        File file = new File(FEEDBACKS.getFilePath());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] feedbackData = line.split(",");

                if (feedbackData.length == 5) {
                    int feedbackID = Integer.parseInt(feedbackData[0].trim());
                    int appointmentID = Integer.parseInt(feedbackData[1].trim());
                    int rating = Integer.parseInt(feedbackData[2].trim());
                    String studentComment = feedbackData[3].trim().isEmpty() ? null : feedbackData[3].replace("###COMMA###", ",");
                    String lecturerComment = feedbackData[4].trim().isEmpty() ? null : feedbackData[4].replace("###COMMA###", ",");

                    FileManager.addFeedbackToCode(feedbackID, new Feedback(feedbackID, appointmentID, rating, studentComment, lecturerComment));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error loading " + file.getName() + " file: " + e.getMessage(),
                    "File Load Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
