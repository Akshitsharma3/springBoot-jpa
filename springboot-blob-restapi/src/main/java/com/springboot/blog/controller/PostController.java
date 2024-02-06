//package com.springboot.blog.controller;
//
//import com.springboot.blog.payload.PostDto;
//import com.springboot.blog.service.PostService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/posts")
//public class PostController {
//    public PostController(PostService postService) {
//        this.postService = postService;
//    }
//
//    private PostService postService;
//
//     @PostMapping
//    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
//         return new ResponseEntity<>(postService.create(postDto), HttpStatus.CREATED);
//     }
//
//}
