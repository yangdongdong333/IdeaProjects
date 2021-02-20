package com.ydd.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/13 15:26
 * @Description:
 */
@Configuration  //标示此类为配置类
@ComponentScan(basePackages = {"com.ydd"})  //开启注解扫描：标示需要扫描注解的类
@EnableAspectJAutoProxy(proxyTargetClass = true)  //生成代理对象
public class ConfigAop
{
}
