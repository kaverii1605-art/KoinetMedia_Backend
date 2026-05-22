package com.koinetmedia.KoinetMedia.controllers;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koinetmedia.KoinetMedia.models.Blog;
import com.koinetmedia.KoinetMedia.repository.BlogRepo;
import com.koinetmedia.KoinetMedia.services.BlogService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BlogController {
    @Autowired
    private BlogService blogService;
    
    @Autowired
    private BlogRepo blogRepository;


    @PostMapping("/addblog")
    public Object addBlog(@RequestBody Blog blog){

        blogService.saveBlog(blog);

        return Map.of("message","Blog created successfully");
    }
    
    
    @GetMapping("/getblogs")
    public List<Blog> getBlogs(){

    return blogRepository.findAll();

    }
  

    @GetMapping("/blogs")
    public Page<Blog> getBlogs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "6") int size) {

        // Prevent negative values
        page = Math.max(page, 0);
        size = Math.max(size, 1);

        return blogRepository.findAll(PageRequest.of(page, size));
    }
    
    @GetMapping("/getblog/{id}")
    public Blog getBlogById(@PathVariable String id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found with id: " + id));
    }
}



