package com.ydd.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Package: com.ydd
 * @ClassName: MyBatisUtils
 * @Author: ydd
 * @CreateTime: 2021/2/22 22:07
 * @Description:
 */
//获取SqlSession的方法
public class MyBatisUtils
{
    private static SqlSessionFactory factory = null;

    static
    {
        String config = "mybatis.xml";//需要和项目中的文件名一样
        try
        {
            InputStream in = Resources.getResourceAsStream(config);
            //创建SqlSessionFactory对象，使用SqlSessionFacgtoryBuild
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //获取SqlSession的方法
    public static SqlSession getSqlSession()
    {
        SqlSession sqlSession=null;
        if (factory!=null){
            sqlSession=factory.openSession(true);
        }
        return sqlSession;

    }
}
