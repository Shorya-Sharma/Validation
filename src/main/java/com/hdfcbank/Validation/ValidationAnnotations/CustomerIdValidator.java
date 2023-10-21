package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CustomerIdValidator implements ConstraintValidator<CustomerIdLength, String> {
    @Override
    public void initialize(CustomerIdLength constraintAnnotation) {
        // Initialization, if needed
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Check if the value is exactly 10 characters long
        if (value == null) {
            return true; // Null values are considered valid
        }

        return value.length() == 10;
    }
}

