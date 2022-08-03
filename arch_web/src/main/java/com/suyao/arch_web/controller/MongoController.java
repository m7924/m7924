package com.suyao.arch_web.controller;


import com.suyao.arch_web.mongo.IStudentService;
import com.suyao.arch_web.mongo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


/**
 * @Classname MongoController
 * @Description TODO
 * @Date 2022/8/1 15:43
 * @Created by B105
 */
@RestController
public class MongoController {

    @Autowired
    IStudentService iStudentService;
    @RequestMapping(value = "/addStudent")
    public int addStudent(){

        Student student = new Student(123L, "king", LocalDateTime.now());


        int result = iStudentService.insertStudent(student);
        return result;
    }

    @RequestMapping(value = "/allStudent")
    public List<Student> getAllStudents(){
        List<Student> users = iStudentService.findtimeByPage(null);
        return users;
    }


}
