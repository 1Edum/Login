package com.example.login_auth_api.service;



import com.example.login_auth_api.dto.LoginDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public interface AuthService {
    String login(LoginDto loginDto);
}
