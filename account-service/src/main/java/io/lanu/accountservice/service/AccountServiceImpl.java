package io.lanu.accountservice.service;

import io.lanu.accountservice.client.AuthServiceFeignClient;
import io.lanu.accountservice.dto.UserDto;
import io.lanu.accountservice.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AuthServiceFeignClient authServiceFeignClient;

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
