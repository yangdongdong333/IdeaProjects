package com.ydd.Spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/30 16:07
 * @Description:
 */
//代理类
public class JDKProxy
{
    public static void main(String[] args)
    {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl=new UserDaoImpl();
        UserDao proxy =(UserDao) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        int result = proxy.add(1, 2);
        System.out.println(result);
    }

}

class UserDaoProxy implements InvocationHandler
{
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        //执行之前
        System.out.println("方法执行之前----》"+method.getName()+"----参数是--"+args);

        //方法执行
       Object res= method.invoke(obj,args);

        //执行之后

        System.out.println("方法执行之后-----"+obj);
        return res;
    }
}