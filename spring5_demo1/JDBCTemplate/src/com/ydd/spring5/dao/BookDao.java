package com.ydd.spring5.dao;

import com.ydd.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/13 22:15
 * @Description:
 */
public interface BookDao
{
//添加方法
    void add(Book book);
    void updateBook(Book book);
    void deleteBook(String id);
    int  selectCount();
    Book findBookInfo(String id);
    List<Book> findAllBook();
    void batchAddBook(List<Object[]> batchArgs);


    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}
