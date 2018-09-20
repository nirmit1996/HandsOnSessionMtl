package com.journaldev.spring.form.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {

    @Override
    public void initialize(Password paramA){}

    @Override
    public boolean isValid(String password, ConstraintValidatorContext ctx){
        if (password.length()<8) return false;
        return true;
    }
}
