package com.huading.shrt.controller;

import com.huading.shrt.entity.result.Account;
import com.huading.shrt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    public Account findById (int accountId){

            Account account=accountService.findById(accountId);
            return  account;
    }

}
