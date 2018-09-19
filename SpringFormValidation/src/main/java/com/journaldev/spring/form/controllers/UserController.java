package com.journaldev.spring.form.controllers;

import com.journaldev.spring.form.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);

    private Map<String, User> users = null;

    public UserController(){
        users = new HashMap<String, User>();
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.GET)
    public String saveUserPage(Model model) {
        logger.info("Returning userSave.jsp page");
        model.addAttribute("user", new User());
        return "userSave";
    }

    @RequestMapping(value = "/user/save.do", method = RequestMethod.POST)
    public String saveUserAction(
            @Valid User user,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "userSave";
        }
        logger.info("Returning userSaveSuccess.jsp page");
        model.addAttribute("user", user);
        users.put(user.getEmail(), user);
        return "userSaveSuccess";
    }


}
