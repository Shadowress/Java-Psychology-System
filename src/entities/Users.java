package entities;

public abstract class Users {
    private int userID;
    private String username;
    private String password;
    private UserType userType;
    
    public Users(int userID, String username, String password, UserType userType) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
