package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.User;
import kr.re.kitri.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User registUser(@RequestBody User user) {

        userService.registUser(user);

        return user;
    }

    @GetMapping("/users")
    public List<User> viewAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User viewUserDetails(@PathVariable String userId) {
        return userService.getUserDetail(userId);
    //public User viewUserDetails(@PathVariable("userId") String Id) {

    }
}
