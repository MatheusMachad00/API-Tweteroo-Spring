package com.tweteroo_spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo_spring.api.dto.TweetDTO;
import com.tweteroo_spring.api.model.Tweet;
import com.tweteroo_spring.api.repository.TweetRepository;

@RestController
@RequestMapping("/api/tweets")
public class TweetsController {

  @Autowired
  private TweetRepository repository;

  @PostMapping
  public void createTweet(@RequestBody TweetDTO req) {
    repository.save(new Tweet(req));
  }

  @GetMapping
  public List<Tweet> getAll() {
    return repository.findAll();
  }
}
