package entities;

public class Student extends Users {

    public Student(int userID, String username, String password) {
        super(userID, username, password, UserType.STUDENT);
    }
}
