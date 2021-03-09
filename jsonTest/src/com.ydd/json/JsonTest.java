package com.ydd.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ydd.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/1 15:20
 * @Description:
 */
public class JsonTest
{
    //1 javaBean和json的转换
    @Test
    public void test1()
    {
        Person person = new Person(1, "国歌好帅");
        //1.1  bean转换成json
        //创建Gson对象实例
        Gson gson = new Gson();
        //toJson方法可以把java对象转换成json字符串
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);
        //1.1  json转换成bean(第一个是json字符串，第二个是目标bean的类)
        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }

    //2 List和json的转换
    @Test
    public void test2()
    {
        //list->json
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "国哥"));
        personList.add(new Person(2, "康师傅"));
        Gson gson = new Gson();
        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);
        //json->list
        List<Person> list = gson.fromJson(personListJsonString, new PersonListType().getType());
        System.out.println(list);
        System.out.println(list.get((0)));

    }

    //3map和json的转换
    @Test
    public void test3()
    {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(1, "国哥好帅"));
        personMap.put(2, new Person(2, "康师傅好帅"));
        Gson gson = new Gson();
        //把map集合转换成json字符串
        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);
    //把json字符串转换成map集合
//        Map<Integer,Person> personMap2 = gson.fromJson(personMapJsonString, new PersonMapType().getType());
        //匿名内部类的形式
        Map<Integer,Person> personMap2 = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap2);
       Person p=  personMap2.get(1);
        System.out.println(p.toString());
    }

}
