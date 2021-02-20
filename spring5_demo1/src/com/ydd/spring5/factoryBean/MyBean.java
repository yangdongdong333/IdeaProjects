package com.ydd.spring5.factoryBean;

import com.ydd.spring5.collectiontype.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/10 15:11
 * @Description:
 */
public class MyBean implements FactoryBean<Book>
{
//定义返回bean的类型
    @Override
    public Book getObject() throws Exception
    {
        Book book =new Book();
        String [] course={"数学","语文"};
        book.setCourses(course);
        return book;
    }

    @Override
    public Class<?> getObjectType()
    {
        return null;
    }

    @Override
    public boolean isSingleton()
    {
        return false;
    }
}
