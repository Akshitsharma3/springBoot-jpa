package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

//Lombook annotation
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post_name",
uniqueConstraints = {
@UniqueConstraint(name = "title",columnNames =
        "title")
}
)

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;
    @CreationTimestamp
    private LocalDateTime createdTimeStamp;
    @UpdateTimestamp
    private  LocalDateTime updatedTimeStamp;
}
