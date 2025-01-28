package maxtheservice.devops.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;
import maxtheservice.devops.demo.entity.User;
import maxtheservice.devops.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    
    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user2 = userService.createUser(user);
        return new ResponseEntity<>(user2, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    
}
