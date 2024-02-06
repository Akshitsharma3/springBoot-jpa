//package com.springboot.blog.entity;
//
//import com.springboot.blog.repository.PostRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class PostTest {
//    @Autowired
//    private PostRepository postRepository;
//    @Autowired
//    private Post post;
//    @Test
//    public void test_save(){
//        Post post =new Post();
//        post.setContent("akshit");
//        post.setTitle("titit");
//        post.setDescription("DES");
//        Post save = postRepository.save(post);
//        System.out.println(save.toString());
//        assertEquals(post.toString(),save.toString());
//    }
//
//}