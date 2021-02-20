package com.ydd.spring5.test;

import com.ydd.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/14 9:03
 * @Description:
 */
public class TestBook
{
    @Test
    public void testJdbcTemplate()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
       BookService bookService = context.getBean("bookService", BookService.class);
       //添加
//       Book book=new Book();
//       book.setUserId("5");
//       book.setUserName("java");
//       book.setUstatus("status");
//        bookService.addBook(book);

        //修改
//        Book book=new Book();
//        book.setUserId("1");
//        book.setUserName("core java");
//        book.setUstatus("正在看");
//        bookService.updateBook(book);
//
//        //删除
//        bookService.deleteBook("4");

        //查询
//       int count= bookService.findCount();
//        System.out.println(count);

//        //查询：返回对象
//        Book book = bookService.findOne("3");
//        System.out.println(book);

        //查询：返回集合
//        List<Book> bookList=bookService.findAll();
//        System.out.println(bookList);

        //批量添加
//        List<Object[]> batchArgs=new ArrayList<>();
//        Object[] objects1={"3","java","正在看"};
//        Object[] objects2={"4","c++","正在看"};
//        Object[] objects3={"5","python","看完了"};
//        Object[] objects4={"6","mysql","正在看"};
//        batchArgs.add(objects1);
//        batchArgs.add(objects2);
//        batchArgs.add(objects3);
//        batchArgs.add(objects4);
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs=new ArrayList<>();
//        Object[] objects1={"java","已修改","3"};
//        Object[] objects2={"c++","已修改","4"};
//        Object[] objects3={"python","已修改","5"};
//
//        batchArgs.add(objects1);
//        batchArgs.add(objects2);
//        batchArgs.add(objects3);
//
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] objects1={"3"};
        Object[] objects2={"4"};
        Object[] objects3={"7"};

        batchArgs.add(objects1);
        batchArgs.add(objects2);
        batchArgs.add(objects3);

        bookService.batchDelete(batchArgs);






    }
}
