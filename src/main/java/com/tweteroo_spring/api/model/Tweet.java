package com.tweteroo_spring.api.model;

import com.tweteroo_spring.api.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Tweets")
public class Tweet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 30, nullable = false)
  private String username;

  @Column(length = 500, nullable = false)
  private String avatar;

  @Column(length = 500, nullable = false)
  private String text;

  public Tweet(TweetDTO data) {
    this.username = data.username();
    this.avatar = data.avatar();
    this.text = data.text();
  }

}
