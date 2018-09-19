package com.journaldev.spring.form.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UserValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Users {
 
     
    String message() default "password not valid";
     
    Class<?>[] groups() default {};
     
    Class<? extends Payload>[] payload() default {};
      
}