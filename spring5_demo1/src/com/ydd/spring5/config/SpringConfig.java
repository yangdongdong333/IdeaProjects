package com.ydd.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/11 21:56
 * @Description:
 */
@Configuration  //将当前类作为配置类，替代xml配置文件
@ComponentScan(basePackages = "com.ydd")
public class SpringConfig
{

}
