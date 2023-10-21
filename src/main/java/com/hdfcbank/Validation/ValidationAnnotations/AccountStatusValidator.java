package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class AccountStatusValidator implements ConstraintValidator<AccountStatus, String> {
    private static final List<String> ALLOWED_STATUSES = Arrays.asList("active", "inactive");

    @Override
    public void initialize(AccountStatus constraintAnnotation) {
        // Initialization, if needed
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Check if the value is one of the allowed statuses
        if (value == null) {
            return true; // Null values are considered valid
        }

        return ALLOWED_STATUSES.contains(value.toLowerCase());
    }
}

