package datastorage;

public enum StartupFileResource {
    USERS("src/datastorage/textfiles/users.txt", "user_id,username,password,user_type", FileLoader::loadUsers),
    APPOINTMENTS("src/datastorage/textfiles/appointments.txt", "appointment_id,student_id,slot_id,status", FileLoader::loadAppointments),
    SLOTS("src/datastorage/textfiles/slots.txt", "slot_id,lecturer_id,date,time", FileLoader::loadSlots),
    FEEDBACKS("src/datastorage/textfiles/feedbacks.txt", "feedback_id,appointment_id,rating,comments", FileLoader::loadFeedbacks);

    private final String filePath;
    private final String fileHeader;
    private final Runnable loader;

    StartupFileResource(String filePath, String fileHeader, Runnable loader) {
        this.filePath = filePath;
        this.fileHeader = fileHeader;
        this.loader = loader;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileHeader() {
        return fileHeader;
    }

    public Runnable getLoader() {
        return loader;
    }
}
