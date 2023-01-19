package com.tweteroo_spring.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo_spring.api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

  List<Tweet> findByUsername(String username);

}
