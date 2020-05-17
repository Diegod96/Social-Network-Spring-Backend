package com.diego.SocialNetwork.repository;



import com.diego.SocialNetwork.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

//    Optional<Subreddit> findByName(String subredditName);
}