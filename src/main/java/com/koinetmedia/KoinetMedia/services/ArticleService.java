package com.koinetmedia.KoinetMedia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koinetmedia.KoinetMedia.models.Articles;
import com.koinetmedia.KoinetMedia.repository.ArticleRepo;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepo articlerepo;

	public Articles savearticle(Articles article) {
		
		return articlerepo.save(article);
	}
}
