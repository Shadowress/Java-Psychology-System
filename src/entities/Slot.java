package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Slot {

    private final int slotID;
    private final int lecturerID;
    private final LocalDate date;
    private final LocalTime time;

    public Slot(int slotID, int lecturerID, LocalDate date, LocalTime time) {
        this.slotID = slotID;
        this.lecturerID = lecturerID;
        this.date = date;
        this.time = time;
    }

    public int getSlotID() {
        return slotID;
    }

    public int getLecturerID() {
        return lecturerID;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}
