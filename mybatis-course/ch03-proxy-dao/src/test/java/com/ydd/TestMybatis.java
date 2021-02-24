package com.ydd;

import com.ydd.dao.StudentDao;
import com.ydd.domain.Student;
import com.ydd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Package: com.ydd
 * @ClassName: TestMybatis
 * @Author: ydd
 * @CreateTime: 2021/2/23 22:20
 * @Description:
 */
public class TestMybatis
{
    @Test
    public void testSelectStudents()
    {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
       List<Student> students= studentDao.selectStudent();
       students.forEach(student -> System.out.println(student));
    }



}
