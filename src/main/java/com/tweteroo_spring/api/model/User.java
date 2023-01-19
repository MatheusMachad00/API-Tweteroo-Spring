package com.tweteroo_spring.api.model;

import com.tweteroo_spring.api.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 30, nullable = false)
  private String username;

  @Column(length = 500, nullable = false)
  private String avatar;

  public User(UserDTO data) {
    this.username = data.username();
    this.avatar = data.avatar();
  }
}
