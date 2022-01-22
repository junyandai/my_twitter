package model;

public class User {
    private static int idCounter = 0;
    private int userId;
    private String userName;
    private String userPassword;


    protected User(String userName, String userPassword) {
        this.userId = idCounter++;
        this.userName = userName;
        this.userPassword = userPassword;

    }


}
