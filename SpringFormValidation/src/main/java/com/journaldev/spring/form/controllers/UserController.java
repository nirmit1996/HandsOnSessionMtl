package com.journaldev.spring.form.controllers;

import com.journaldev.spring.form.model.Customer;
import com.journaldev.spring.form.model.User;
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

    private Map<String, User> userData = null;

    public UserController() {
        userData = new HashMap<String, User>();
    }

    @RequestMapping(value = "/login/users.get", method = RequestMethod.GET)
    public String saveUserPage(Model model) {
        model.addAttribute("user", new User());
        return "usrSave";
    }


    @RequestMapping(value = "/login/users.save", method = RequestMethod.POST)
    public String saveUserAction(
        @Valid User user,
        BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "usrSave";
        }
        model.addAttribute("user", user);
        userData.put(user.getEmail(), user);
        return "usrSaveSuccess";
    }
}
