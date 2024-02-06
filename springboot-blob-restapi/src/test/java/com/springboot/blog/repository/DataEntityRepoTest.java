package com.springboot.blog.repository;

import com.springboot.blog.entity.TcsDataEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DataEntityRepoTest {
    @Autowired
    private DataEntityRepo dataEntityRepo;


    @Test
    public void test_dataEntitySave() {
        TcsDataEntity tcsDataEntity=
                new TcsDataEntity("0", "h0");
//        tcsDataEntity.
        tcsDataEntity.setName("amit");
        tcsDataEntity.setTech("java");
//        tcsDataEntity.setEmpId(99009L);
        TcsDataEntity tcsDataEntitySave =
                dataEntityRepo.save(tcsDataEntity);
        System.out.println(tcsDataEntitySave);


    }

    @Test
    public void  test_updateDataEntity(){

        TcsDataEntity tcsDataEntity = dataEntityRepo.findById(1L).get();
        tcsDataEntity.setTech("python");
        dataEntityRepo.save(tcsDataEntity);

    }

    @Test
    public void test_saveAll() {
        TcsDataEntity tcsDataEntity=
                new TcsDataEntity("0","h0");
        TcsDataEntity tcsDataEntity1=
                new TcsDataEntity("1","h1");
        TcsDataEntity tcsDataEntity2=
                new TcsDataEntity("2","h2");
        TcsDataEntity tcsDataEntity3=
                new TcsDataEntity("3","h3");
        List<TcsDataEntity> tcsDataEntities =
                dataEntityRepo.saveAll(List.of(tcsDataEntity, tcsDataEntity1, tcsDataEntity2, tcsDataEntity3));
        tcsDataEntities.forEach(System.out::println);

    }

    @Test
    public void  test_findAll(){
        List<TcsDataEntity> all = dataEntityRepo.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void test_deleteById(){
        dataEntityRepo.deleteById(155L);
    }

    @Test
    public void test_count(){
        long count = dataEntityRepo.count();
        System.out.println("count "+count);
    }
    
    @Test
    public void  test_deleteAll(){
        dataEntityRepo.deleteAll();
    }
}