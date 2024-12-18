package com.ushan.userManagement.controller;

import com.ushan.userManagement.controller.dto.UserDTO;
import com.ushan.userManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/get_users")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(path = "/add_user")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return  userService.saveUser(userDTO);
    }

    @PutMapping(path = "/update_user")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping(path = "/delete_user")
    public String deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

}




