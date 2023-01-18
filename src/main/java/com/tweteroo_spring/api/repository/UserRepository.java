package com.tweteroo_spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo_spring.api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
