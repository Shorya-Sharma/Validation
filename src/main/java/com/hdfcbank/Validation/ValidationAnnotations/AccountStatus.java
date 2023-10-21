package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AccountStatusValidator.class)
@Documented
public @interface AccountStatus {
    String message() default "Account status must be 'active' or 'inactive'";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

