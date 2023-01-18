package com.tweteroo_spring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo_spring.api.dto.TweetDTO;
import com.tweteroo_spring.api.model.Tweet;

@RestController
@RequestMapping("/api/tweets")
public class TweetsController {

  @PostMapping
  public void createTweet(@RequestBody TweetDTO req) {
    System.out.println(req);
  }

  /* @GetMapping
  public List<Tweet> getTweets() {
    return (Arrays.asList());
  } */
}
