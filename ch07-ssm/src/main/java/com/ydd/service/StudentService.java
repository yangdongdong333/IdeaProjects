package com.ydd.service;

import com.ydd.doman.Student;

import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/15 12:20
 * @Description:
 */
public interface StudentService
{
    int addStudent(Student student);
    List<Student> findStudents();
}
