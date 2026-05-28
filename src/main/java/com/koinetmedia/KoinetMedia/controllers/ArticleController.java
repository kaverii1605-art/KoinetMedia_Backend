package com.koinetmedia.KoinetMedia.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koinetmedia.KoinetMedia.models.Articles;
import com.koinetmedia.KoinetMedia.models.Blog;
import com.koinetmedia.KoinetMedia.repository.ArticleRepo;
import com.koinetmedia.KoinetMedia.services.ArticleService;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ArticleController {
	
	@Autowired
	private ArticleService articleservice;
	
	@Autowired
	private ArticleRepo articlerepo;

	@PostMapping("/addarticle")
	public Object addarticle(@RequestBody Articles article ) {
		
		articlerepo.save(article);
		
		return Map.of("message","Article Added Successfully");
		
	}
	
	@GetMapping("/getarticles")
	public List<Articles> getarticle(){
		return articlerepo.findAll();
	}
	
	 @GetMapping("/getarticle/{id}")
	    public Articles getArticleById(@PathVariable String id) {
	        return articlerepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Blog not found with id: " + id));
	    }
}
