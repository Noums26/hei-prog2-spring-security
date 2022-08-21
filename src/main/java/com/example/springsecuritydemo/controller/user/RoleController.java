package com.example.springsecuritydemo.controller.user;

import com.example.springsecuritydemo.model.user.Role;
import com.example.springsecuritydemo.model.user.User;
import com.example.springsecuritydemo.repository.user.RoleRepository;
import com.example.springsecuritydemo.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserService userService;

    @PostMapping("/addrole")
    public Role addRole(@RequestBody Role role){
        return roleRepository.save(role);
    }

    @PostMapping("/adduser")
    public User addRole(@RequestBody User user){
        return userService.addUser(user);
    }
}
