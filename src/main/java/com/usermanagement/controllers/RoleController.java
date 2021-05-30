package com.usermanagement.controllers;

import com.usermanagement.models.entities.Role;
import com.usermanagement.services.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usermanagement/role")
public class RoleController {
    

    @Autowired
    private RoleService roleService;

    @PostMapping
    public Role create(@RequestBody Role role){
        return roleService.save(role);
    }

    @GetMapping
    public Iterable<Role> findAll(){
        return roleService.findAll();
    }
}
