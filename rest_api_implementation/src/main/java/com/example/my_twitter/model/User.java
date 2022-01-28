package com.example.my_twitter.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -2043124272853586341L;

    private static int idCounter = 0;

    @Id
    private long userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userpassword")
    private String userPassword;





    public User(String userName, String userPassword) {
        this.userId = idCounter++;
        this.userName = userName;
        this.userPassword = userPassword;

    }

    protected User() {

    }

    public long getUserId() {
        return userId;
    }

    public boolean changePassword(String oldPassword, String newPassword,
                                  String newPasswordAgain) {
        if (oldPassword.equals(this.userPassword) && newPassword.equals(newPasswordAgain)) {
            this.userPassword = newPassword;
            return true;
        }

        return false;
    }



}
