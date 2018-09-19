package com.journaldev.spring.form.controllers;

import com.journaldev.spring.form.model.BaseResponse;
import com.journaldev.spring.form.model.User;
import com.journaldev.spring.form.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory
            .getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String getLoginRequest(Model model) {
        logger.info("Returning userLogin.jsp page");
        model.addAttribute("user", new User());
        return "userLogin";
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String postLoginRequest(@Valid User user,
                                   BindingResult bindingResult, Model model ){

        if (bindingResult.hasErrors()) {
            logger.info("User Login Failed With form errors.Returning userLogin.jsp");
            return "userLogin";
        }
        BaseResponse response = userService.validateUserLogin(user);
        if (!response.isSuccess()) {
            logger.info("User Login Failed With Invalid credentials.Returning userLogin.jsp");
            model.addAttribute("errorMsg", response.getErrorMessage());
            return "userLogin";
        }

        logger.info("User Login SuccessFull Returning userPostLoginPage.jsp");
        model.addAttribute("allEmails", userService.getAllExistingUserEmails());
        return "userPostLoginPage";
    }

}
