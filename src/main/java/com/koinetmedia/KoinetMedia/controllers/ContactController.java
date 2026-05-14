package com.koinetmedia.KoinetMedia.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koinetmedia.KoinetMedia.models.Contacts;
import com.koinetmedia.KoinetMedia.repository.ContactRepo;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactRepo contactRepository;

    // POST contact form
    @PostMapping("/postContact")
    public Contacts saveContact(@RequestBody Contacts contact) {
        return contactRepository.save(contact);
    }

}