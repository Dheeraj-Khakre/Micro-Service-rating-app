package com.dk.userService.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dk.userService.Service.UserService;
import com.dk.userService.entities.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;



@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    @CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "getUserFailur")
    @Retry(name = "ratingHotelService", fallbackMethod = "ratingHotelFallback")
    @RateLimiter(name = "userRateLimiter", fallbackMethod = "ratingHotelFallback")
    public ResponseEntity<Users> getUserById(@PathVariable Integer id) {
        Users u1 = userService.getUsersById(id);
        return ResponseEntity.ok(u1);

    }
    
    public ResponseEntity<Users> getUserFailur(@PathVariable Integer id, Exception ex) {

        Users user = new Users(null, "dumy", "dumy@gmail.com",
                "this si the circuit failure some of the service is down  error = "+ex);
                return ResponseEntity.ok(user);
            }
   

    
    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
      return  ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.creatUsers(user));
    }
}

