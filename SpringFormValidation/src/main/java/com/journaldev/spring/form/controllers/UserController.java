package com.journaldev.spring.form.controllers;

import com.journaldev.spring.form.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UserController {

    private static final Logger logger = LoggerFactory
            .getLogger(CustomerController.class);

    private Map<String, User> users = null;

    public UserController(){
        users = new HashMap<String, User>();
    }




}
