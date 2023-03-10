package com.tweteroo_spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo_spring.api.dto.TweetDTO;
import com.tweteroo_spring.api.model.Tweet;
import com.tweteroo_spring.api.service.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tweets")
public class TweetsController {

  @Autowired
  private TweetService service;

  @PostMapping
  public void createTweet(@RequestBody @Valid TweetDTO req) {
    service.create(req);
  }

  @GetMapping
  public List<Tweet> getAll() {
    return service.getAll();
  }

  @GetMapping
  @RequestMapping("/{username}")
  public List<Tweet> getByUsername(@PathVariable String username) {
    return service.getByUsername(username);
  }
}
