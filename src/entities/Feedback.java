package entities;

public class Feedback {

    private int feedbackID;
    private int appointmentID;
    private int rating;
    private String studentComment;
    private String lecturerComment;

    public Feedback(int feedbackID, int appointmentID, int rating, String studentComment, String lecturerComment) {
        this.feedbackID = feedbackID;
        this.appointmentID = appointmentID;
        this.rating = rating;
        this.studentComment = studentComment;
        this.lecturerComment = lecturerComment;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public int getRating() {
        return rating;
    }

    public String getStudentComment() {
        return studentComment;
    }

    public String getLecturerComment() {
        return lecturerComment;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setStudentComment(String studentComment) {
        this.studentComment = studentComment;
    }

    public void setLecturerComment(String lecturerComment) {
        this.lecturerComment = lecturerComment;
    }
}
