package com.ydd;

import com.github.pagehelper.PageHelper;
import com.ydd.dao.StudentDao;
import com.ydd.domain.Student;
import com.ydd.utils.MyBatisUtils;
import com.ydd.vo.Vo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
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
        Student student=new Student();
        student.setName("lisi");
        student.setAge(18);
       List<Student> students=studentDao.selectStudentIf(student);
    }

    @Test
    public void testSelectStudentWhere()
    {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("lisi");
        student.setAge(18);
        List<Student> students=studentDao.selectStudentWhere(student);
        students.forEach(student1 -> System.out.println(student1));
    }

    @Test
    public void testSelectStudentForeach()
    {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Integer> list=new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        List<Student> students=studentDao.selectStudentForEach(list);
        students.forEach(student1 -> System.out.println(student1));
    }


    @Test
    public void testSelectAll()
    {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        //加入PageHelper的方法，分页
        //pageNum 第几页  从1开始
        //pageSize 一页中有多少行数据
        PageHelper.startPage(1,3);
        List<Student> students=studentDao.selectAll();
        students.forEach(student1 -> System.out.println(student1));
    }
}
