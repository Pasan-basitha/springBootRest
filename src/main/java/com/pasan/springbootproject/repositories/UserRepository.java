package com.pasan.springbootproject.repositories;

import com.pasan.springbootproject.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {

    //getAllUsers
    //create
    //update
    //findById
    //delete
}
