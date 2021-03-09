package com.ydd.spring5.dao;

import com.ydd.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/13 22:15
 * @Description:
 */
@Repository
public class BookDaoImpl implements BookDao
{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book)
    {

//1 创建sql语句
        String sql="insert into t_book values (?,?,?)";
        //2  调用方法实现
        //这个方法可以实现增加，修改，删除操作,返回影响的行数
       int update=jdbcTemplate.update(sql,book.getUserId(),book.getUserName(),book.getUstatus());
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book)
    {
        //1 创建sql语句
        String sql="update  t_book set username=?,ustatus=? where userId=?";
        //2  调用方法实现
        //这个方法可以实现增加，修改，删除操作,返回影响的行数
        int update=jdbcTemplate.update(sql,book.getUserName(),book.getUstatus(),book.getUserId());
        System.out.println(update);
    }

    @Override
    public void deleteBook(String id)
    {
        //1 创建sql语句
        String sql="delete from t_book where userId=?";
        //2  调用方法实现
        //这个方法可以实现增加，修改，删除操作,返回影响的行数
        int update=jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    @Override
    public int selectCount()
    {
        String sql="select count(*) from t_book";
        Integer resoult=jdbcTemplate.queryForObject(sql,Integer.class);
        return resoult.intValue();
    }

    @Override
    public Book findBookInfo(String id)
    {
        String sql="select * from t_book where userId=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBook()
    {
        String sql="select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs)
    {
        String sql="insert into t_book values (?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs)
    {
        String sql="delete from t_book where userId=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs)
    {
        String sql="update  t_book set username=?,ustatus=? where userId=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
