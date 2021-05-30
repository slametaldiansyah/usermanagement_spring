package com.usermanagement.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.usermanagement.models.entities.Role;
import com.usermanagement.repos.RoleRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
    
    @Autowired
    private RoleRepo roleRepo;

    public Role save(Role role){
        return roleRepo.save(role);
    }

    public Iterable<Role> findAll(){
        return roleRepo.findAll();
    }

    public Role findOne(Long id){
        Optional<Role> role = roleRepo.findById(id);
        if (!role.isPresent()) {
        return null;
        }
        return role.get();
    }

    public void removeOne(Long id){
        roleRepo.deleteById(id);
    }

    public List<Role> findByName(String name){
        return roleRepo.findByNameContains(name);
    }
}
