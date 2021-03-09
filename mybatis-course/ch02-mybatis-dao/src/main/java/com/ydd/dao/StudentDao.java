package com.ydd.dao;

import com.ydd.domain.Student;

import java.util.List;

/**
 * @Package: com.ydd.dao
 * @ClassName: StudentDao
 * @Author: ydd
 * @CreateTime: 2021/2/23 8:50
 * @Description:
 */
public interface StudentDao
{
List<Student> selectStudent();
}
