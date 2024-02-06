package com.springboot.blog.repository;

import com.springboot.blog.entity.TcsDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataEntityRepo extends JpaRepository<TcsDataEntity, Long> {
}
