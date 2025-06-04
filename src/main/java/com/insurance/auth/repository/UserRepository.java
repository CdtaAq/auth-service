// src/main/java/com/insurance/auth/repository/UserRepository.java
package com.insurance.auth.repository;

import com.insurance.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
