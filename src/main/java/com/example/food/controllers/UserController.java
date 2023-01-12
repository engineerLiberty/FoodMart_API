package com.example.food.controllers;

import com.example.food.dto.EditUserDto;
import com.example.food.restartifacts.BaseResponse;
import com.example.food.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/users")
@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PutMapping("/edit-user")
    public ResponseEntity<BaseResponse> editUserDetails(@Valid @RequestBody EditUserDto editUserDto) {
        return new ResponseEntity<>(userService.editUserDetails(editUserDto), HttpStatus.ACCEPTED);
    }
}
