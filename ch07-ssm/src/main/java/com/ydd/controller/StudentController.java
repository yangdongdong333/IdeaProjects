package com.ydd.controller;

import com.ydd.doman.Student;
import com.ydd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/15 12:25
 * @Description:
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController
{
    @Autowired
    private StudentService studentService;

    //注册学生
    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student) //对象接收，要求jsp页面中控件的name值与对象的属性名一致
    {
        ModelAndView mv = new ModelAndView();
        //调用service处理student
        int nums = studentService.addStudent(student);
        String tips = "注册失败";
        if (nums > 0)
        {
            tips = "学生【" + student.getName() + "】注册成功";
        }

        //添加数据
        mv.addObject("tips", tips);
        //指定结果页面
        mv.setViewName("result");
        return mv;
    }

    //处理查询，响应ajax（需要转换成json：3个点：jackson依赖、mvc的配置中需要加入注解驱动、处理器方法上面加ResponseBody注解）
    @RequestMapping(value = "/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent()
    {
        //参数检查、一些简单的数据处理
        List<Student> students = studentService.findStudents();
        return students;
    }
}
