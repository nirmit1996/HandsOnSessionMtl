package com.journaldev.spring.form.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserValidator implements ConstraintValidator<Users, String> {


    @Override
    public void initialize(Users constraintAnnotation) {

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext ctx) {
        if(password == null){
            return false;
        }
        //validate phone numbers of format "1234567890"
        /*if (phoneNo.matches("\\d{10}")) return true;
            //validating phone number with -, . or spaces
        else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
            //validating phone number with extension length from 3 to 5
        else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
            //validating phone number where area code is in braces ()
        else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
            //return false if nothing matches the input **/
        if (password.length()>=10)
            return true;

        else return false;
    }

}
