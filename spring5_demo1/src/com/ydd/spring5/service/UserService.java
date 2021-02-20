package com.ydd.spring5.service;

import com.ydd.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/9 22:17
 * @Description:
 */
/**
 加其他注解也可以：比如@Service,@controller,@repository
 注解中里面的value属性值可以省略不写
 默认是首字母小写的类名称
 UserService--
 */
//@Component(value = "userService")
//
//    @Controller
//    @Repository
//等同于<bean id="userService" class="..." ></bean>
@Service(value = "userService")
public class UserService
{
    //当autowired注解存在时，不需要在设置set方法了
   @Autowired // 根据类型注入
    //当存在多个实现类的时候，类型不一定能找到，这时候需要指定value属性
    @Qualifier(value = "userDaoImpl-1") //根据名称注入
//    @Resource(name="userDaoImpl-1") 参数是bean的name
    private UserDao userDao;
   @Value(value = "abc")
   private String name;

//    public void setUserDao(UserDao userDao)
//    {
//        this.userDao = userDao;
//    }

    public void add(){
        System.out.println("service add .......");
        userDao.update();
        System.out.println("name : "+name);

    }
}
