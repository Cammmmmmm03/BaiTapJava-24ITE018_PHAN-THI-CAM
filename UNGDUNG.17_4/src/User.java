package model;

public class User {
    private String username;
    private String email;
    private String hashedPassword;

    public User(String username, String email, String hashedPassword) {
        this.username = username;
        this.email = email;
        this.hashedPassword = hashedPassword;
    }
}
