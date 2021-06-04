package com.pasan.springbootproject.services.impl;

import com.pasan.springbootproject.domain.UserDTO;
import com.pasan.springbootproject.repositories.UserRepository;
import com.pasan.springbootproject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAllUsers() {
       List<UserDTO>allUsers=userRepository.findAll();
       return allUsers;
    }

    @Override
    public String saveUser(UserDTO userdata) {
        userRepository.save(userdata);
        return "Data saved";
    }

    @Override
    public String updateUser(UserDTO newUserData) {
        String msg=null;
        if (newUserData.getId()!=null){
            userRepository.save(newUserData);
            msg="User Updated";
        }else {
            msg="Error";
        }
        return msg;
    }

    @Override
    public String deleteUser(Integer id) {
        String msg=null;
        if ( userRepository.existsById(id) ){
            userRepository.deleteById(id);
            msg="User Deleted";
        }else{
            msg="No such user";
        }
        return msg;
    }

     /*@Override
   public UserDTO findById(Integer id) {

        return userRepository.findOne(id);
    }*/
}
