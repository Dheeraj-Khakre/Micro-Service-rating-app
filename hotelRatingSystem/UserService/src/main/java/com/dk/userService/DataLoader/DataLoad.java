package com.dk.userService.DataLoader;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dk.userService.Repo.UserRepo;
import com.dk.userService.entities.Users;

@Configuration
public class DataLoad {

    private final UserRepo userRepo;

    public DataLoad(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    
     @Bean
    CommandLineRunner initDatabase() {
        return args -> {
             List<Users> users = List.of(
                    new Users(null, "dheeraj","dheeraj@gmail.com"," im software devloper"),
                    new Users(null, "reena","reena@gmail.com"," im software devloper"),
                   new Users(null, "alkesh","alkesh@gmail.com"," im software devloper"),
                   new Users(null, "somatee","somatee@gmail.com"," im software devloper"),
                    new Users(null, "amit","amit@gmail.com"," im software devloper"));
        
             userRepo.saveAll(users);
             System.out.println(users);
        };
    }
}
