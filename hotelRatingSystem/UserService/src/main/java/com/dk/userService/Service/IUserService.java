package com.dk.userService.Service;

import java.util.List;

import com.dk.userService.entities.Users;

public interface IUserService {
    
    // creating user 
    public Users creatUsers(Users user);

    public List<Users> getAllUsers();

    public Users getUsersById(Integer id);
}
