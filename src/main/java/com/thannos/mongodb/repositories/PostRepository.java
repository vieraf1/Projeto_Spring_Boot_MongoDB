package com.thannos.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thannos.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}