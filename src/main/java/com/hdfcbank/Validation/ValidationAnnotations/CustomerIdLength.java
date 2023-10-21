package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomerIdValidator.class)
@Documented
public @interface CustomerIdLength {
    String message() default "Customer ID must be exactly 10 characters long";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

