package com.journaldev.spring.form.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty(message = "Email Cannot Be Empty")
    @Email(message = "Please Enter a valid email")
    private String email;

    @NotEmpty(message = "Password Cannot Be Empty")
    @Size(min = 8, message = "Password should contain at least 8 chars")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password doesn't meet the minimum requirements")
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {

    }

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
