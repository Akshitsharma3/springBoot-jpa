package com.springboot.blog.controller;

import com.springboot.blog.bean.StudentBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Combination of responseBody and controller
// anotation
@RestController
public class StudentController {
    @GetMapping("helloWorld")
    public String helloWorld(){
        return "Get Api Working";
    }

    //Single student information
    @GetMapping("studentInfo")
    public StudentBean getStudent(){
        StudentBean st=new StudentBean("akshit"
                ,"sharma",1);
        return st;
    }

    //Multiple students info
    @GetMapping("studentsInfo")
    public List<StudentBean> getStudents(){
        List<StudentBean> arrayLists =
                new ArrayList<>();
        arrayLists.add(new StudentBean("s1","l1",1));
        arrayLists.add(new StudentBean("s2","l2",2));
        arrayLists.add(new StudentBean("s3","l3",3));
        return arrayLists;
    }

    //@PathVariable - it's used to bind it
    // value touritemplate variable
    @GetMapping("student/{id}")
    public StudentBean getStudentId(@PathVariable int id) {
        StudentBean studentBean = new StudentBean("A", "z", id);
        return studentBean;
    }

    @GetMapping("student/{id}/{name}/{lastname}")
    public StudentBean getStudentId(@PathVariable int id,@PathVariable String name,@PathVariable String lastname) {
        StudentBean studentBean =
                new StudentBean(name, lastname,
                        id);
        return studentBean;
    }

    //Query parameter in uritemplate
    //http://localhost:8080/student/firstname
    // ?fname=400&lname=pGl&id=3
    @GetMapping("student/firstname")
    public String queryParam(@RequestParam String fname,
                             @RequestParam String lname,
                             @RequestParam int id){

        return  fname+" "+lname+" "+id+" " +
                "requestParam";
    }

}
