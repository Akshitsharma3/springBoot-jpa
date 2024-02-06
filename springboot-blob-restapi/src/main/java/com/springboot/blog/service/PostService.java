package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;

import java.util.List;

public interface PostService {
   public PostDto create(PostDto postDto);
   public List<PostDto> findAll();
}
