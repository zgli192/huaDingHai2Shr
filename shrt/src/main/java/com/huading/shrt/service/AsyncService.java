package com.huading.shrt.service;

import com.huading.shrt.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: huaDingHai2Shr
 * @description: test
 * @author: lizhe zeng
 * @create: 2021-03-01 17:11
 **/

@Service
public class AsyncService {

    @Async
    public void hello(){
        System.out.println("进入service。。。");
        try {
            Thread.sleep(3000);
            System.out.println("3S后数据开始处理中。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
