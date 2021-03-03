package com.huading.shrt.task;

/**
 * @program: huaDingHai2Shr
 * @description: 异步任务
 * @author: lizhe zeng
 * @create: 2021-03-01 15:58
 **/

import com.huading.shrt.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * Asynchronous Tasks
 * @author Xu
 *
 */
@Component
public class AsyncTask {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AsyncService asyncService;

    @Async("mySimpleAsync")
    public Future<String> doTask1() throws InterruptedException{
        logger.info("Task1 started.");
        System.out.println("进入Task。。。");
        asyncService.hello();
        long start = System.currentTimeMillis();
        Thread.sleep(3000);//获取订单数据
        long end = System.currentTimeMillis();
        logger.info("Task1 finished, time elapsed: {} ms.", end-start);
        return new AsyncResult<>("Task1 accomplished!");
    }

    @Async("myAsync")
    public Future<String> doTask2() throws InterruptedException{
        logger.info("Task2 started.");
        long start = System.currentTimeMillis();
        Thread.sleep(3000);// 如发送短信提示任务耗时3s
        long end = System.currentTimeMillis();

        logger.info("Task2 finished, time elapsed: {} ms.", end-start);

        return new AsyncResult<>("Task2 accomplished!");
    }
}
