package com.koinetmedia.KoinetMedia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koinetmedia.KoinetMedia.models.Blog;
import com.koinetmedia.KoinetMedia.repository.BlogRepo;

@Service
public class BlogService {

	 @Autowired
	    private BlogRepo blogRepository;

	    public Blog saveBlog(Blog blog){
	        return blogRepository.save(blog);
	    }
}
