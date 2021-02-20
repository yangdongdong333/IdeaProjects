package com.ydd.webfluxdemo1.service.impl;

import com.ydd.webfluxdemo1.entity.User;
import com.ydd.webfluxdemo1.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/21 18:40
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService
{
    //创建一个map集合来存储数据
    private final Map<Integer,User> users=new HashMap<>();
    public UserServiceImpl(){
        this.users.put(1,new User("lucy","nan",20));
        this.users.put(2,new User("mary","nv",30));
        this.users.put(3,new User("jack","nv",50));
    }
    //根据ID查询
    @Override
    public Mono<User> getUserById(Integer id)
    {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser()
    {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono)
    {

        return userMono.doOnNext(person->{
            int id=users.size()+1;
            users.put(id,person);
        }).thenEmpty(Mono.empty()); //Mono.empty()表示清空，清空后即代表发送完成信息。
    }
}
