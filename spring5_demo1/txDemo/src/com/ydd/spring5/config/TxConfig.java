package com.ydd.spring5.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/18 20:19
 * @Description:
 */
@Configuration  //表示这是一个配置类
@ComponentScan(basePackages = "com.ydd") //组件扫描，参数为包路径
@EnableTransactionManagement  //开启事务
public class TxConfig
{
    //创建数据库连接池
    @Bean  //创建连接池对象
    public DruidDataSource getDruidDataSource()
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");  //驱动名称
        dataSource.setUrl("jdbc:mysql:///user_db?useSSL=false"); //数据库的URL地址
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource)
    {
        //到IOC容器中根据类型寻找dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入dataSource，
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource)
    {
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
