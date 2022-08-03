package com.suyao.arch_web.mongo;


import com.suyao.arch_web.mongo.entity.Student;

import java.util.List;

/**
 * @Classname IStudentService
 * @Description TODO
 * @Date 2022/8/1 15:36
 * @Created by B105
 */
public interface IStudentService {
    int insertStudent(Student student);

    int updateStudent(Student student);

    int removeStudent(Long id);

    Student findOne(Student student);

    List<Student> findlike(Student student);

    List<Student> findmore(Student student);

    List<Student> findtime(Student student);

    List<Student> findtimeByPage(Student student);
}
