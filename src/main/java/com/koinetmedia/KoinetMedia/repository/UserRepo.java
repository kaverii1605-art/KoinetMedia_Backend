package com.koinetmedia.KoinetMedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.koinetmedia.KoinetMedia.models.User;

public interface UserRepo extends MongoRepository<User, Long> {

	User findByEmailAndPassword(String email,String password);

}
