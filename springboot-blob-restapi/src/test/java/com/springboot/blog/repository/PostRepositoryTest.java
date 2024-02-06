package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;

    @Test
    public void test_save(){
Post post =new Post();
        post.setContent("akshit");
        post.setTitle("titit");
        post.setDescription("DES");
        Post save = postRepository.save(post);
        System.out.println(save.toString());
        assertEquals(post.toString(),save.toString());
    }

}