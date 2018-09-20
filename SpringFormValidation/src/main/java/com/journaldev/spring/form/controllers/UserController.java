package com.journaldev.spring.form.controllers;

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

    public static Map<String, String> userList = new HashMap<String, String>();

    @RequestMapping(value="/createUser", method = RequestMethod.GET)
    public String createUser(Model model){
        model.addAttribute("user", new User());
        return "createUser";
    }

    @RequestMapping(value = "/saveUser", method=RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "createUser";
        }
        userList.put(user.getEmail(), user.getPassword());
        model.addAttribute("user", user);
        return "redirect:/getUsers";
    }

    @RequestMapping(value = "/getUsers", method=RequestMethod.GET)
    public String getUsers(Model model){
        model.addAttribute("userList", userList);
        return "getUsers";
    }
}
