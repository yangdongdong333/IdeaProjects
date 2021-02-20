package com.ydd.webfluxdemo1.service;

import com.ydd.webfluxdemo1.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/21 18:30
 * @Description:
 */
//用户操作接口
public interface UserService
{
    //根据id查询,Mono实现了CorePublisher发布者返回1个或0个元素
    Mono<User> getUserById(Integer id);
    //查询所有的用户
    Flux<User> getAllUser();

    //添加用户
    Mono<Void> saveUserInfo(Mono<User> user);
}
