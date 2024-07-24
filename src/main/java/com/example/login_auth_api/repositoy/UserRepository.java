package com.example.login_auth_api.repositoy;

import com.example.login_auth_api.domain.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
