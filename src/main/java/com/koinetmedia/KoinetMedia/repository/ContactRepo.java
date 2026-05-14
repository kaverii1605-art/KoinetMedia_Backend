package com.koinetmedia.KoinetMedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.koinetmedia.KoinetMedia.models.Contacts;

public interface ContactRepo extends MongoRepository<Contacts, Long> {

}
