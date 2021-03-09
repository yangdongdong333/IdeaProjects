package com.ydd.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/10 11:41
 * @Description:
 */
public class Book
{
    //1 数组类型属性
    private String [] courses;
    //2 List集合类型属性
    private List<String> list;
    //3 map集合类型属性
    private Map<String,String> maps;
    private Set<String> sets;
    public void setCourses(String[] courses)
    {
        this.courses = courses;
    }

    public void setList(List list)
    {
        this.list=list;
    }

    public void setMaps(Map<String, String> maps)
    {
        this.maps = maps;
    }

    public void setSets(Set<String> sets)
    {
        this.sets = sets;
    }


    public String to()
    {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                '}';
    }
}
