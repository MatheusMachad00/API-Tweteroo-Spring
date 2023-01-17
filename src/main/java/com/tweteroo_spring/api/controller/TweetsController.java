package com.tweteroo_spring.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo_spring.api.dto.TweetDTO;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

  @PostMapping
  public void createTweet(@RequestBody TweetDTO req) {
    System.out.println(req);
  }
}
