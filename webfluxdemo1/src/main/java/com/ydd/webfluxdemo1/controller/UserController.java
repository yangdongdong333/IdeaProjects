package com.ydd.webfluxdemo1.controller;

import com.ydd.webfluxdemo1.entity.User;
import com.ydd.webfluxdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/21 20:05
 * @Description:
 */
@RestController
public class UserController
{
    //注入service
    @Autowired
    private UserService userService;

    //id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable int id)
    {
        return userService.getUserById(id);
    }
    //查询所有
    @GetMapping("/user")
    public Flux<User> getUsers(){
        return  userService.getAllUser();
    }
    //添加
    @PostMapping("/saveUser")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> userMono=Mono.just(user);
     return    userService.saveUserInfo(userMono);
    }


}
