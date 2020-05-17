package com.diego.SocialNetwork.repository;

import com.diego.SocialNetwork.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
//    List<Comment> findByPost(Post post);
//
//    List<Comment> findAllByUser(User user);
}