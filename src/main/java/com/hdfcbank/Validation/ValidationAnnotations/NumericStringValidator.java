package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NumericStringValidator implements ConstraintValidator<NumericString, String> {
    @Override
    public void initialize(NumericString constraintAnnotation) {
        // Initialization, if needed
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Check if the value contains only numeric characters
        if (value == null) {
            return true; // Null values are considered valid
        }

        return value.matches("^[0-9]+$");
    }
}
