package com.ydd.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/12 15:03
 * @Description:
 */
//代理类
public class JDKProxy
{
    public static void  main(String[] args)
    {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        //创建指定接口的代理类的实例，也就是UserDaoImpl的代理对象

        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        int resoult = dao.add(1, 2);
        System.out.println(resoult);

    }
}

//创建代理对象代码(调用处理器）
class UserDaoProxy implements InvocationHandler
{
    //1 把我们被创建代理的类的对象传递过来,此处为UserDaoImpl
    //有参数构造器
    private Object obj;

    public UserDaoProxy(Object obj)
    {
        this.obj = obj;
    }

    //    当本类的对象被创建时，下面的invoke方法就会被调用
//增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        //方法之前执行的增强逻辑
        System.out.println("方法之前执行--" + method.getName() + "--" + Arrays.toString(args));
        //方法执行
        /**
         * @Paramter obj :可以调用方法的那个对象，也就是增强类的对象
         * @Paramter args : 调用方法需要用到的参数
         */
        Object res = method.invoke(obj, args);
        // 方法之后执行的增强逻辑
        System.out.println("方法之后执行 ：" + obj);
        return res;
    }
}