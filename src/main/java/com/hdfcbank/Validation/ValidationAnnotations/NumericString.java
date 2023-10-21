package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NumericStringValidator.class)
@Documented
public @interface NumericString {
    String message() default "Must contain only numeric characters";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

