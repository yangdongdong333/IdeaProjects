ch07-ssm: SSM整合开发。
SSM：SpringMVC+Spring+MyBatis


实现步骤：
0 使用springdb的mysql库，表使用student
1 新建maven web项目
2 加入依赖
springmvc，spring，mybatis三个框架的依赖，jackson依赖，mysql驱动，druid连接池，jsp、servlet依赖
3 写web.xml
1)注册DispatcherServlet:1、创建springmvc容器对象，才能创建controller类对象
                        2、创建的是sevlet，才能接收用户的请求
2）注册spring的监听器：ContextLoaderLister，目的：创建spring的容器对象，才能创建service、dao对象
3）注册字符集过滤器，解决post请求乱码的问题
4 创建包，controller包，service、dao，实体类包名创建好
5 写springmvc、spring，mybatis的配置文件
1）springmvc的配置文件
2）spring配置文件
3）mybatis主配置文件
4）数据库的属性配置文件
6 写代码，dao接口和mapper文件，service和实现类，controller、实体类
7 写jsp页面
