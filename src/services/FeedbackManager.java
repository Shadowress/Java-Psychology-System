package services;

import datastorage.FileManager;
import datastorage.FileWriterAppender;
import entities.Feedback;

public class FeedbackManager {

    public static void addStudentFeedback(int appointmentID, int rating, String studentComment) {
        Feedback feedback = FileManager.getFeedbacks().get(appointmentID);

        if (feedback != null) {
            feedback.setStudentComment(studentComment);
            feedback.setRating(rating);
            FileWriterAppender.writeFeedbacks();
        } else {
            FileManager.addNewFeedback(appointmentID, rating, studentComment, null);
        }
    }

    public static void addLecturerFeedback(int appointmentID, String lecturerComment) {
        Feedback feedback = FileManager.getFeedbacks().get(appointmentID);

        if (feedback != null) {
            feedback.setLecturerComment(lecturerComment);
            FileWriterAppender.writeFeedbacks();
        } else {
            FileManager.addNewFeedback(appointmentID, -1, null, lecturerComment);
        }
    }
}
