package com.journaldev.spring.form.controllers;

import com.journaldev.spring.form.model.Customer;
import com.journaldev.spring.form.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    private Map<String, String> usersList = new HashMap<String, String>();

    @RequestMapping(value = "/cust/login", method = RequestMethod.GET)
    public String userLoginPage(Model model) {
        model.addAttribute("user",new User());
        return "loginPage";
    }

    @RequestMapping(value = "/cust/saveUser", method = RequestMethod.POST)
    public String loginUser(@Valid User user,Model model) {

        if(usersList.isEmpty()){
            usersList.put(user.getUsername(),user.getPassword());
        }else{
            for (Map.Entry<String, String> entry : usersList.entrySet())
            {
                if(entry.getKey().equals(user.getUsername()) && entry.getValue().equals(user.getPassword())){
                    return "usersList";
                }
            }
            usersList.put(user.getUsername(),user.getPassword());
        }
        model.addAttribute("error",)
        return "loginPage";
    }
}


