package com.springboot.blog.repository;

import com.springboot.blog.entity.TcsDataEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
@SpringBootTest
class QueryDataRepoTest {
    @Autowired
    private QueryDataRepo queryDataRepo;

    @Test
    void testQueryJPAByEmpId(){

        TcsDataEntity tcsDataEntity = queryDataRepo.findByEmpId(202L).get();
        System.out.println("byEmpId "+tcsDataEntity);
        tcsDataEntity.setTech("python");
        queryDataRepo.save(tcsDataEntity);
    }


    @Test
    void testQueryJPAfindByEmpIdAndTech(){


        Optional<TcsDataEntity> byEmpIdAndTech = queryDataRepo.findByEmpIdAndTech(202L, null);
        System.out.println("byEmpId "+byEmpIdAndTech);
        Optional<TcsDataEntity> byEmpIdAndTech1 = queryDataRepo.findByEmpIdAndTech(202L, "python");
        System.out.println("byEmpId1 "+byEmpIdAndTech1);
        List<TcsDataEntity> byEmpIdOrTech = queryDataRepo.findByEmpIdOrTech(202L,
                null);
        byEmpIdOrTech.forEach(System.out::println);
    }

    @Test
    void test_findDistinctByTech(){
        List<TcsDataEntity> distinctByTech = queryDataRepo.findDistinctByTech(null);
        distinctByTech.forEach(System.out::println);
    }

    @Test
    void test_findByEmpIdGreaterThan(){
        List<TcsDataEntity> distinctByTech =
                queryDataRepo.findByEmpIdGreaterThan(203L);
        distinctByTech.forEach(System.out::println);
    }

    @Test
    void test_findByTechContaining(){

        TcsDataEntity byTechContaining = queryDataRepo.findByTechContaining("py");
        System.out.println(byTechContaining);
    }

    @Test
    void test_findByEmpId(){
        List<TcsDataEntity> byEmpIdBetween =
                queryDataRepo.findByEmpIdBetween(202L, 203L);
        byEmpIdBetween.forEach(System.out::println);
    }
    @Test
    void test_limit(){
        List<TcsDataEntity> top2ByOrderByEmpIdDesc = queryDataRepo.findTop2ByOrderByEmpIdDesc();
        top2ByOrderByEmpIdDesc.forEach(System.out::println);
    }
}