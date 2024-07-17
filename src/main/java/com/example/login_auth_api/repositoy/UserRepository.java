package com.example.login_auth_api.repositoy;

import com.example.login_auth_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
