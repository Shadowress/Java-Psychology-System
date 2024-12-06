package entities;

public class Lecturer extends Users {

    public Lecturer(int userID, String username, String password) {
        super(userID, username, password, UserType.LECTURER);
    }
    
    
}
