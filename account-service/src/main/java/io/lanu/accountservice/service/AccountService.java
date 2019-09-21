package io.lanu.accountservice.service;

import io.lanu.accountservice.dto.UserDto;
import io.lanu.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
