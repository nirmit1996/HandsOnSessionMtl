package com.journaldev.spring.form.service;

import com.journaldev.spring.form.model.BaseResponse;
import com.journaldev.spring.form.model.User;

import java.util.ArrayList;

public interface UserService {

    BaseResponse validateUserLogin(User user);

    ArrayList<String> getAllExistingUserEmails();

}
