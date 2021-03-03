package com.huading.shrt.controller;

import com.huading.shrt.service.AsyncService;
import com.huading.shrt.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: huaDingHai2Shr
 * @description:
 * @author: lizhe zeng
 * @create: 2021-03-01 17:12
 **/

@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;
    @Autowired
    AsyncTask asyncTask;
    @GetMapping("/hello")
    public String hello() {
        System.out.println("进入Controller。。。");
        asyncService.hello();
        return "success";
    }
    @GetMapping("/hello2")
    public String hellos() {
        System.out.println("进入Controller。。。 hello2");
        try {
            asyncTask.doTask1();//比如这个是订单获取任务
            asyncTask.doTask2();//比如这个发短信验证任务
        } catch (InterruptedException e) {
            System.out.println("error");
        }
        return "successTask";
    }
}


