package com.nix.cinema.repository;

import com.nix.cinema.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String userName);

    User findByEmail(String email);

    User findByPhone(String phone);
}

