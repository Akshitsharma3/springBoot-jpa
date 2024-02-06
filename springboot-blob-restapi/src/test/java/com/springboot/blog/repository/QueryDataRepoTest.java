package com.springboot.blog.repository;

import com.springboot.blog.entity.TcsDataEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class QueryDataRepoTest {
    @Autowired
    private QueryDataRepo queryDataRepo;

    @Test
    public void testQueryJPAByEmpId(){

        TcsDataEntity tcsDataEntity = queryDataRepo.findByEmpId(202L).get();
        System.out.println("byEmpId "+tcsDataEntity);
        tcsDataEntity.setTech("python");
        queryDataRepo.save(tcsDataEntity);
    }


    @Test
    public void testQueryJPAfindByEmpIdAndTech(){


        Optional<TcsDataEntity> byEmpIdAndTech = queryDataRepo.findByEmpIdAndTech(202L, null);
        System.out.println("byEmpId "+byEmpIdAndTech);
        Optional<TcsDataEntity> byEmpIdAndTech1 = queryDataRepo.findByEmpIdAndTech(202L, "python");
        System.out.println("byEmpId1 "+byEmpIdAndTech1);
        List<TcsDataEntity> byEmpIdOrTech = queryDataRepo.findByEmpIdOrTech(202L,
                null);
        byEmpIdOrTech.forEach(System.out::println);
    }

    @Test
    public void test_findDistinctByTech(){
        List<TcsDataEntity> distinctByTech = queryDataRepo.findDistinctByTech(null);
        distinctByTech.forEach(System.out::println);
    }

    @Test
    public void test_findByEmpIdGreaterThan(){
        List<TcsDataEntity> distinctByTech =
                queryDataRepo.findByEmpIdGreaterThan(203L);
        distinctByTech.forEach(System.out::println);
    }
}