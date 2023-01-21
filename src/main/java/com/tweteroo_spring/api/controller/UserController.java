package com.tweteroo_spring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo_spring.api.dto.UserDTO;
import com.tweteroo_spring.api.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/sign-up")
public class UserController {

  @Autowired
  private UserService service;

  @PostMapping
  public void createUser(@RequestBody @Valid UserDTO req) {
    service.create(req);
  }
}
