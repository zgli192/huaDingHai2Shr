package com.huading.shrt.task;

import com.huading.shrt.controller.AccountController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: huaDingHai2Shr
 * @description: 测试  --- 加入定时任务
 * @author: lizhe zeng
 * @create: 2021-02-26 17:01
 **/
@Component
public class JobKelly {
    @Autowired
    AccountController accountController;

    @Scheduled(cron = "0 23 10 * * *")
    public  void  getjobKelly(){
        String testName= accountController.findById(4).getName();
        System.out.println( "----kekly");

    }

    @Scheduled(fixedDelayString= "2000")
    public  void getThreadKelly(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("@@@@@@"+simpleDateFormat.format(new Date()));
        String testName= accountController.findById(4).getName();
        System.out.println("----"+testName);
    }
}
