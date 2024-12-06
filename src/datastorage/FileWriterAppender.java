package datastorage;

import static datastorage.StartupFileResource.APPOINTMENTS;
import static datastorage.StartupFileResource.FEEDBACKS;
import static datastorage.StartupFileResource.SLOTS;
import static datastorage.StartupFileResource.USERS;
import entities.Appointment;
import entities.Feedback;
import entities.Slot;
import entities.Users;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FileWriterAppender {

    public static void writeUsers() {
        File file = new File(USERS.getFilePath());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(USERS.getFileHeader());
            writer.newLine();

            for (Users user : FileManager.getUsers().values()) {
                String line = String.join(",",
                        String.valueOf(user.getUserID()),
                        user.getUsername(),
                        user.getPassword(),
                        user.getUserType().name()
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void writeAppointments() {
        File file = new File(APPOINTMENTS.getFilePath());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(APPOINTMENTS.getFileHeader());
            writer.newLine();

            for (Appointment appointment : FileManager.getAppointments().values()) {
                String line = String.join(",",
                        String.valueOf(appointment.getAppointmentID()),
                        String.valueOf(appointment.getStudentID()),
                        String.valueOf(appointment.getSlotID()),
                        appointment.getStatus().name(),
                        String.valueOf(appointment.getRescheduleSlotID())
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void writeSlots() {
        File file = new File(SLOTS.getFilePath());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(SLOTS.getFileHeader());
            writer.newLine();

            for (Slot slot : FileManager.getSlots().values()) {
                String line = String.join(",",
                        String.valueOf(slot.getSlotID()),
                        String.valueOf(slot.getLecturerID()),
                        slot.getDate().toString(),
                        slot.getTime().toString()
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void writeFeedbacks() {
        File file = new File(FEEDBACKS.getFilePath());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(FEEDBACKS.getFileHeader());
            writer.newLine();

            for (Feedback feedback : FileManager.getFeedbacks().values()) {
                String line = String.join(",",
                        String.valueOf(feedback.getFeedbackID()),
                        String.valueOf(feedback.getAppointmentID()),
                        String.valueOf(feedback.getRating()),
                        feedback.getStudentComment().replace(",", "###COMMA###"),
                        feedback.getLecturerComment().replace(",", "###COMMA###")
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void appendUser(Users user) {
        File file = new File(USERS.getFilePath());

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            String line = String.join(",",
                    String.valueOf(user.getUserID()),
                    user.getUsername(),
                    user.getPassword(),
                    user.getUserType().name()
            );
            writer.println(line);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void appendAppointment(Appointment appointment) {
        File file = new File(APPOINTMENTS.getFilePath());

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            String line = String.join(",",
                    String.valueOf(appointment.getAppointmentID()),
                    String.valueOf(appointment.getStudentID()),
                    String.valueOf(appointment.getSlotID()),
                    appointment.getStatus().name(),
                    String.valueOf(appointment.getRescheduleSlotID())
            );
            writer.println(line);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void appendSlot(Slot slot) {
        File file = new File(SLOTS.getFilePath());

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            String line = String.join(",",
                    String.valueOf(slot.getSlotID()),
                    String.valueOf(slot.getLecturerID()),
                    slot.getDate().toString(),
                    slot.getTime().toString()
            );
            writer.println(line);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void appendFeedback(Feedback feedback) {
        File file = new File(FEEDBACKS.getFilePath());

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            String line = String.join(",",
                    String.valueOf(feedback.getFeedbackID()),
                    String.valueOf(feedback.getAppointmentID()),
                    String.valueOf(feedback.getRating()),
                    feedback.getStudentComment().replace(",", "###COMMA###"),
                    feedback.getLecturerComment().replace(",", "###COMMA###")
            );
            writer.println(line);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to " + file.getName() + " file: " + e.getMessage(),
                    "File Write Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
