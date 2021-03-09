package com.ydd.dao;

import com.ydd.domain.Student;
import com.ydd.vo.Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: com.ydd.dao
 * @ClassName: StudentDao
 * @Author: ydd
 * @CreateTime: 2021/2/23 8:50
 * @Description:
 */
public interface StudentDao
{
//动态sql，需要使用java对象作为参数
    List<Student> selectStudentIf(Student student);
    List<Student> selectStudentWhere(Student student);
    //使用list循环其中的基本数据类型
    List<Student> selectStudentForEach(List<Integer> idList);

    //使用foreach循环list列表中对象的属性
    List<Student> selectStudentForEachTwo(List<Integer> idList);

    //使用pageHepler分页数据
    List<Student> selectAll();
}
