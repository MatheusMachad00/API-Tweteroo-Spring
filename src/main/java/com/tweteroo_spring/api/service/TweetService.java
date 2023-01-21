package com.tweteroo_spring.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo_spring.api.dto.TweetDTO;
import com.tweteroo_spring.api.model.Tweet;
import com.tweteroo_spring.api.repository.TweetRepository;

@Service
public class TweetService {

  @Autowired
  private TweetRepository repository;

  public void create(TweetDTO req) {
    repository.save(new Tweet(req));
  }

  public List<Tweet> getAll() {
    return repository.findAll();
  }

  public List<Tweet> getByUsername(String username) {
    return repository.findByUsername(username);
  }
}
