package com.journaldev.spring.form.model;

import com.journaldev.spring.form.validator.Users;

public class User {

    String email;
    @Users
    String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
