package com.ydd.dao;

import com.ydd.domain.Student;

import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/20 8:28
 * @Description:
 */
//用接口操作student表
public interface StudentDao
{
    //查询Student表的所有数据
    public List<Student> selectStudents();
}
