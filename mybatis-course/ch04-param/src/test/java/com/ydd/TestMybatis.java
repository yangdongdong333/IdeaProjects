package com.ydd;

import com.ydd.dao.StudentDao;
import com.ydd.domain.Student;
import com.ydd.utils.MyBatisUtils;
import com.ydd.vo.Vo;
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
    public void testSelectStudentById()
    {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
       List<Student> students= studentDao.selectStudentById(1002);
       students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testselectMultiParam()
    {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> students= studentDao.selectMultiParam("张三",20);
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testselectMultiByObject()
    {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Vo vo=new Vo();
        vo.setParamAge(20);
        vo.setParamName("张三");
        List<Student> students= studentDao.selectMultiByObject(vo);
        students.forEach(student -> System.out.println(student));
    }

}
