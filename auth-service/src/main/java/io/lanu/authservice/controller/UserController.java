package io.lanu.authservice.controller;

import io.lanu.authservice.domain.User;
import io.lanu.authservice.dto.UserDto;
import io.lanu.authservice.dto.UserRegistrationDto;
import io.lanu.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/current")
    public Principal getUser(Principal principal) {
        return principal;
    }

    @PostMapping
    @PreAuthorize("#oauth2.hasScope('server')")
    public UserDto createUser(@Valid @RequestBody UserRegistrationDto userRegistration) {
        User savedUser = userService.create(toUser(userRegistration));
        return toDto(savedUser);
    }

    private UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        return userDto;
    }

    private User toUser(UserRegistrationDto userRegistration) {
        User user = new User();
        user.setUsername(userRegistration.getUsername());
        user.setPassword(userRegistration.getPassword());
        return user;
    }

}
