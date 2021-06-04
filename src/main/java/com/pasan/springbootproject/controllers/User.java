package com.pasan.springbootproject.controllers;

import com.pasan.springbootproject.domain.UserDTO;
import com.pasan.springbootproject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers(){
       return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO Userdata){
        return userServices.saveUser(Userdata);

    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO newUserData){
       return userServices.updateUser(newUserData);
    }

  /*  @GetMapping("/find/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
        return userServices.findById(id);
    }*/

    @DeleteMapping("/delete/{id}")
        public String deleteUser(@PathVariable Integer id){
            return userServices.deleteUser(id);

    }

}
