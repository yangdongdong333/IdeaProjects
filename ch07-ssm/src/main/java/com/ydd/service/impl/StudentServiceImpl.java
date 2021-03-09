package com.ydd.service.impl;

import com.ydd.dao.StudentDao;
import com.ydd.doman.Student;
import com.ydd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/15 12:21
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService
{
    //引用类型的自动注入
    @Resource
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student)
    {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents()
    {

        return studentDao.selectStudent();
    }
}
