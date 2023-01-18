package com.tweteroo_spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo_spring.api.model.User;

public interface UserRepositoy extends JpaRepository<User, Long> {

}
