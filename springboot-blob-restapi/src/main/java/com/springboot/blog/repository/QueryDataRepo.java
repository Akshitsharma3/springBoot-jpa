package com.springboot.blog.repository;

import com.springboot.blog.entity.TcsDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QueryDataRepo extends JpaRepository<TcsDataEntity,Long> {
    Optional<TcsDataEntity> findByEmpId(Long empId);
    Optional<TcsDataEntity> findByEmpIdAndTech(Long empId, String tech);

     List<TcsDataEntity> findByEmpIdOrTech(Long empId,String tech);

    List<TcsDataEntity> findDistinctByTech(String tech);
    List<TcsDataEntity> findByEmpIdGreaterThan(Long empId);
    TcsDataEntity findByTechContaining(String tech);
}
