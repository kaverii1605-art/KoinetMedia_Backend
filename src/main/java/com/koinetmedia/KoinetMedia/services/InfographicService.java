package com.koinetmedia.KoinetMedia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koinetmedia.KoinetMedia.models.Infographic;
import com.koinetmedia.KoinetMedia.repository.InfographicRepo;


@Service
public class InfographicService {

	@Autowired
	private InfographicRepo inforepo;
	
	public Infographic saveinfo(Infographic infographic) {
		return inforepo.save(infographic);
	}
	
}
