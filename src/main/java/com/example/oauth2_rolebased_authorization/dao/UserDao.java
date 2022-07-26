package com.example.oauth2_rolebased_authorization.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
}
