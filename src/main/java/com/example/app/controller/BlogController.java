package com.example.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.repo.Blog;
import com.example.app.service.BlogService;


@RestController
@RequestMapping("/blogs")
public class BlogController {

	@Autowired
	BlogService blogService;
	
	@GetMapping
	public List<Blog> getBlogs() {
		return blogService.getBlogs();
	}
	
	
	@GetMapping("/{Id}")
	public Optional<Blog> getBlog(@PathVariable Long Id) {
		return blogService.getBlog(Id);
	};
	
	@PostMapping("/add-blog")
	public void addBlog(@RequestBody Blog Blog) {
		blogService.addBlog(Blog);
	};
	
	@DeleteMapping("/delete-blog/{Id}")
	public void deleteBlog(@PathVariable Long Id) {
		blogService.deleteBlog(Id);
	};
}
