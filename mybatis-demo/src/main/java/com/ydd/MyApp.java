package com.ydd;

import com.ydd.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Package: com.ydd
 * @ClassName: MyApp
 * @Author: ydd
 * @CreateTime: 2021/2/21 20:52
 * @Description:
 */
public class MyApp {
    public static void main(String[] args) throws IOException {
        //访问MyBatis读取Student数据
        //1、定义mybatis主配置文件的名称，从类路径的根（target/classess）开始
        String config="mybatis.xml";
        //2 、读取这个config文件
        InputStream in = Resources.getResourceAsStream(config);

        //3、创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //4 、创建SqlSessionFactory对象
        SqlSessionFactory factory=builder.build(in);
        //5、【zhongyao 】获取SqlSession对象，从这里买呢获取sqlSession
        SqlSession sqlSession=factory.openSession();
        //6、指定要执行的sql语句的标识。sql映射文件中的namespace+“.”+再加上标签的id值
        String sqlid="com.ydd.dao.StudentDao"+"."+"selectStudents";
        //7 、通过sql语句的id执行sql语句，
        List<Student> studentList = sqlSession.selectList(sqlid);
        //8、输出结果
        studentList.forEach(student -> System.out.println(student));
        //9、关闭SqlSession对象
        sqlSession.close();

    }

}
