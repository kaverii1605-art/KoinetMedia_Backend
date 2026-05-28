package com.koinetmedia.KoinetMedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.koinetmedia.KoinetMedia.models.Articles;

@Repository
public interface ArticleRepo extends MongoRepository<Articles, String> {

}
