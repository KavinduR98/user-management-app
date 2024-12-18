package com.ushan.userManagement.service;

import com.ushan.userManagement.controller.dto.UserDTO;
import com.ushan.userManagement.model.User;
import com.ushan.userManagement.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers(){
        List<User> userList = userRepository.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO saveUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

//    public String deleteUser(UserDTO userDTO){
//        userRepository.delete(modelMapper.map(userDTO, User.class));
//        return "User Deleted!";
//    }

    public String deleteUser(Integer userId){
        userRepository.deleteById(userId);
        return "User Deleted!";
    }


}
