package com.ushan.userManagement.controller;

import com.ushan.userManagement.controller.dto.UserDTO;
import com.ushan.userManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/get_users")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

}
