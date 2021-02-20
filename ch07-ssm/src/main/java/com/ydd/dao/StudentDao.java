package com.ydd.dao;

import com.ydd.doman.Student;

import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/15 11:57
 * @Description:
 */
public interface StudentDao
{
    int insertStudent(Student student);
    List<Student> selectStudent();
}
