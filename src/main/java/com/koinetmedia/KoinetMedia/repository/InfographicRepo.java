package com.koinetmedia.KoinetMedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.koinetmedia.KoinetMedia.models.Infographic;

@Repository
public interface InfographicRepo extends MongoRepository<Infographic, String> {

}
