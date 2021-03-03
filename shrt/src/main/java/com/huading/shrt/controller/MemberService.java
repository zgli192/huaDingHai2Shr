package com.huading.shrt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: huaDingHai2Shr
 * @description: 测试scan
 * @author: lizhe zeng
 * @create: 2021-02-26 16:39
 **/
@RestController
public class MemberService {
    @RequestMapping("/getMember")
    public  String getMember(){
        return  "Kelly";
    }
}
