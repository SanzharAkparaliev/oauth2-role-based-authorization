package com.example.oauth2_rolebased_authorization.service;

import com.example.oauth2_rolebased_authorization.dto.UserDto;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserService {

    UserDto save(UserDto user);
    List<UserDto> findAll();
    User findOne(long id);
    void delete(long id);
}
