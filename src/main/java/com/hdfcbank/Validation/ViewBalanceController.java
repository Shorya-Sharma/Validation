package com.hdfcbank.Validation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/viewBalance")
public class ViewBalanceController {

    @PostMapping("/create")
    public void  createUser(@RequestBody @Valid UserDto userDto) {
        System.out.println(userDto.getAccountNumber());
    }
}

