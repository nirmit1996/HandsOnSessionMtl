package com.journaldev.spring.form.service.Impl;

import com.journaldev.spring.form.model.BaseResponse;
import com.journaldev.spring.form.model.User;
import com.journaldev.spring.form.repositories.UserRepository;
import com.journaldev.spring.form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public BaseResponse validateUserLogin(User user) {
        Map<String, User> users = userRepository.getMapOfUsers();
        BaseResponse response = new BaseResponse();
        String userEnteredEmail = user.getEmail().trim();
        if (!users.containsKey(userEnteredEmail)) {
            response.setErrorMessage("No Such Email Exists. Please Register First ...");
            return response;
        }
        User userFromUsersMap = users.get(userEnteredEmail);
        if (!userFromUsersMap.getPassword().equals(user.getPassword().trim())) {
            response.setErrorMessage("Invalid Password. Please Try Again ...");
            return response;
        }
        response.setSuccess(true);
        return response;
    }

    @Override
    public ArrayList<String> getAllExistingUserEmails() {
        return new ArrayList<String>(userRepository.getMapOfUsers().keySet());
    }
}
