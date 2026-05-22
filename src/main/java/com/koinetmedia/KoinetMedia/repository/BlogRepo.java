package com.koinetmedia.KoinetMedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.koinetmedia.KoinetMedia.models.Blog;

@Repository
public interface BlogRepo extends MongoRepository<Blog, String>{

}
