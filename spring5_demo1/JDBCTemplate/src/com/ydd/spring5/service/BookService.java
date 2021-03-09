package com.ydd.spring5.service;

import com.ydd.spring5.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydd.spring5.entity.*;

import java.util.List;


/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/13 22:15
 * @Description:
 */
@Service
public class BookService
{
    //注入dao
    @Autowired
    private BookDao bookDao;

    //增加
    public void addBook(Book book)
    {
        bookDao.add(book);
    }

    //修改
    public void updateBook(Book book)
    {
        bookDao.updateBook(book);
    }

    //删除
    public void deleteBook(String id)
    {
        bookDao.deleteBook(id);
    }

    //查询表中的记录数
    public int findCount()
    {
        return bookDao.selectCount();
    }

    public Book findOne(String userId)
    {
        return bookDao.findBookInfo(userId);
    }

    public List<Book> findAll()
    {
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs)
    {
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs)
    {
        bookDao.batchUpdateBook(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs)
    {
        bookDao.batchDeleteBook(batchArgs);
    }


}
