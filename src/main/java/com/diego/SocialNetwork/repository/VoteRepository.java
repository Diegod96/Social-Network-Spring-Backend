package com.diego.SocialNetwork.repository;


import com.diego.SocialNetwork.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
//    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}