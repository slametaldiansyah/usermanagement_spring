package com.usermanagement.repos;

import java.util.List;

import com.usermanagement.models.entities.Role;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role, Long> {

    List<Role> findByNameContains(String name);
}
