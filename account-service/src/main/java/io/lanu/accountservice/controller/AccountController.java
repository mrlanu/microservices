package io.lanu.accountservice.controller;

import io.lanu.accountservice.dto.UserDto;
import io.lanu.accountservice.dto.UserRegistrationDto;
import io.lanu.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
        return accountService.create(user);
    }

}
