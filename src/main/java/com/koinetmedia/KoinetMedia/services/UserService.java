package com.koinetmedia.KoinetMedia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koinetmedia.KoinetMedia.models.User;
import com.koinetmedia.KoinetMedia.repository.UserRepo;


@Service
public class UserService {

	@Autowired
    private UserRepo repo;

    public User saveUser(User user){
        return repo.save(user);
    }
}
