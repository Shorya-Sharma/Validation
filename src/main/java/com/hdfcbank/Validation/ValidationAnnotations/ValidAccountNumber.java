package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AccountNumberValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidAccountNumber {
    String message() default "Account number must be exactly 14 digits long.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

