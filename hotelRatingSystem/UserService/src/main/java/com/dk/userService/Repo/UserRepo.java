package com.dk.userService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dk.userService.entities.Users;

@Repository
public interface UserRepo  extends  JpaRepository<Users, Integer>{
     
}
