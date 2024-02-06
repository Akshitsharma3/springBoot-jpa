//package com.springboot.blog.service.impl;
//
//import com.springboot.blog.entity.Post;
//import com.springboot.blog.payload.PostDto;
//import com.springboot.blog.repository.PostRepository;
//import com.springboot.blog.service.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PostServiceImpl implements PostService {
//    @Autowired
//    private PostRepository postRepository;
//
//
//    @Override
//    public PostDto create(PostDto postDto) {
//        Post post = new Post();
//        post.setContent(postDto.getContent());
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        Post saveEntity = postRepository.save(post);
//        PostDto newPost = new PostDto();
//        newPost.setId(saveEntity.getId());
//        newPost.setDescription(saveEntity.getDescription());
//        newPost.setTitle(saveEntity.getTitle());
//        newPost.setContent(saveEntity.getContent());
//        return newPost;
//    }
//
////    @Override
////    public List<PostDto> findAll() {
////        List<Post> all = postRepository.findAll();
////        return all;
////    }
//}
