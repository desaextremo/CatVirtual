package com.unab.catvirtual.catvirtualg31.controller;


import com.unab.catvirtual.catvirtualg31.entity.User;
import com.unab.catvirtual.catvirtualg31.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> listusers()
    {
        return userService.listusers();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") String id){
        return userService.findById(id);
    }

    @PostMapping("/new")
    public User addUser(@RequestBody User User){
        return userService.addUser(User);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
    }

    @PutMapping("/save")
    public User saveUser(@RequestBody User User){
        return userService.saveUser(User);
    }
}
