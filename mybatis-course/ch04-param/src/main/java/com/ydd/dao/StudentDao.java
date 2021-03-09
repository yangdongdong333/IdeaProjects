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
List<Student> selectStudentById(Integer id);
/**
 * 传递多个参数：命名参数，在形参定义的前面加入@Param注解（“形参的别名”）
 */
List<Student> selectMultiParam(@Param("myname") String name,
                               @Param("myage") Integer age);
/**
 *多个参数，使用java对线工作为接口中方法的参数
 */
List<Student> selectMultiByObject (Vo vo);
}
