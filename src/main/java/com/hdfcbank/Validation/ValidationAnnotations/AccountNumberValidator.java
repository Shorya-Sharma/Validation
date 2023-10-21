package com.hdfcbank.Validation.ValidationAnnotations;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AccountNumberValidator implements ConstraintValidator<ValidAccountNumber, String> {
    @Override
    public void initialize(ValidAccountNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String accountNumber, ConstraintValidatorContext context) {
        // Check if the accountNumber is exactly 14 digits long
        return accountNumber != null && accountNumber.matches("^\\d{14}$");
    }
}

