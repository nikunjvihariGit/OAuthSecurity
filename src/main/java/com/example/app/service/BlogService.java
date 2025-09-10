package com.example.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.repo.Blog;
import com.example.app.repo.BlogRepository;

@Service
public class BlogService {
	
	@Autowired
	BlogRepository blogRepository;
	
	public List<Blog> getBlogs() {
		return blogRepository.findAll();
	}
	
	public Optional<Blog> getBlog(Long Id) {
		return blogRepository.findById(Id);
	}
	
	public void addBlog(Blog blog) {
		blogRepository.save(blog);
	}
	
	public void deleteBlog(Long Id) {
		blogRepository.deleteById(Id);
	}
}
