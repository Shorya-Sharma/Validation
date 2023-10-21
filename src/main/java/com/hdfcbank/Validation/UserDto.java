package com.hdfcbank.Validation;


import com.hdfcbank.Validation.ValidationAnnotations.AccountStatus;
import com.hdfcbank.Validation.ValidationAnnotations.CustomerIdLength;
import com.hdfcbank.Validation.ValidationAnnotations.NumericString;
import com.hdfcbank.Validation.ValidationAnnotations.ValidAccountNumber;
import jakarta.validation.constraints.Email;

public class UserDto {

    @ValidAccountNumber
    @NumericString
    private String accountNumber;

    @CustomerIdLength
    @NumericString
    private String customerId;
    @AccountStatus
    private String accountStatus;

    // Constructors, getters, and setters

    public UserDto() {
    }

    public UserDto(String accountNumber, String customerId, String accountStatus) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.accountStatus = accountStatus;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}

