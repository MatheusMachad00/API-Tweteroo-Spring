package com.tweteroo_spring.api.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo_spring.api.dto.UserDTO;

@RestController
@RequestMapping("/api/auth/sign-up")
public class LoginController {

  @PostMapping
  public void createUser(@RequestBody UserDTO req) {
    System.out.println(req);
  }
}
