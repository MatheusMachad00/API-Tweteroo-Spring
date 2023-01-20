package com.tweteroo_spring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo_spring.api.dto.UserDTO;
import com.tweteroo_spring.api.model.User;
import com.tweteroo_spring.api.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/sign-up")
public class LoginController {

  @Autowired
  private UserRepository repository;

  @PostMapping
  public void createUser(@RequestBody @Valid UserDTO req) {
    repository.save(new User(req));
  }
}
