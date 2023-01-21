package com.tweteroo_spring.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo_spring.api.dto.UserDTO;
import com.tweteroo_spring.api.model.User;
import com.tweteroo_spring.api.repository.UserRepository;

@Service
public class UserService {
  
  @Autowired
  private UserRepository repository;

  public void create(UserDTO req){
    repository.save(new User(req));
  }

}
