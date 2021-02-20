package com.ydd.demoreactor8.reactor8;

import org.springframework.web.server.WebHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/21 9:03
 * @Description:
 */
public class TestReactor
{
    public static void main(String[] args)
    {

        //just方法可以直接去声明元素
        //没有订阅之前什么都不会输出
        Flux.just(1,2,3,4).subscribe(System.out::println);//每输出一个元素，就换一行
        Mono.just(1).subscribe(System.out::println);


//        //其他方法
//        Integer [] array={1,2,3,4};
//        Flux.fromArray(array);
//
//        List<Integer> list= Arrays.asList(array);
//        Flux.fromIterable(list);
//
//        Stream<Integer> stream=list.stream();
//        Flux.fromStream(stream);


    }
}
