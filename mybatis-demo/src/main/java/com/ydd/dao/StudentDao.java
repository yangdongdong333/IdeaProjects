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
    //插入方法

    /**
     *
     * @param student 表示要插入进去的数据
     * @return int表示执行inert操作后，影响数据库的行数
     */
    public int insertStudent (Student student);
}
