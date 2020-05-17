package com.diego.SocialNetwork.repository;

import com.diego.SocialNetwork.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
//    List<Post> findAllBySubreddit(Subreddit subreddit);
//
//    List<Post> findByUser(User user);
}