package com.pasan.springbootproject.services;

import com.pasan.springbootproject.domain.UserDTO;

import java.util.List;

public interface UserServices {

    List<UserDTO> findAllUsers();

    String saveUser(UserDTO userdata);

    String updateUser(UserDTO newUserData);

    String deleteUser(Integer id);

    //UserDTO  findById(Integer id);
}
