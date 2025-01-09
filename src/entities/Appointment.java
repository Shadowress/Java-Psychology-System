package entities;

public class Appointment {

    private int appointmentID;
    private int studentID;
    private int slotID;
    private AppointmentStatus status;
    private int rescheduleSlotID;

    public Appointment(int appointmentID, int studentID, int slotID, AppointmentStatus status, int rescheduleSlotID) {
        this.appointmentID = appointmentID;
        this.studentID = studentID;
        this.slotID = slotID;
        this.status = status;
        this.rescheduleSlotID = rescheduleSlotID;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getSlotID() {
        return slotID;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public int getRescheduleSlotID() {
        return rescheduleSlotID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setSlotID(int slotID) {
        this.slotID = slotID;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public void setRescheduleSlotID(int rescheduleSlotID) {
        this.rescheduleSlotID = rescheduleSlotID;
    }
}
