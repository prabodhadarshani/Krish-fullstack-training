package com.prabodha.rentcloud.authorizationserver.authorizationserver.repository;

import com.prabodha.rentcloud.authorizationserver.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {
   Optional<User> findByUsername(String name);
}
