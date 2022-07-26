package com.example.oauth2_rolebased_authorization.service;

import org.springframework.security.core.Authentication;

public interface AuthenticationFacadeService {

    Authentication getAuthentication();
}
