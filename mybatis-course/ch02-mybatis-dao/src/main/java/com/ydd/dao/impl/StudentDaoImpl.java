package com.ydd.dao.impl;

import com.ydd.dao.StudentDao;
import com.ydd.domain.Student;
import com.ydd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Package: com.ydd.dao
 * @ClassName: StudentDaoImpl
 * @Author: ydd
 * @CreateTime: 2021/2/23 9:06
 * @Description:
 */
public class StudentDaoImpl implements StudentDao
{
    @Override
    public List<Student> selectStudent()
    {
        //获取SqlSession对象
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        String sqlid="com.ydd.dao.StudentDao."+"selectStudent";
        List<Student> students=sqlSession.selectList(sqlid);
        students.forEach(student -> System.out.println(student));
        //关闭
        sqlSession.close();
        return null;
    }
}
