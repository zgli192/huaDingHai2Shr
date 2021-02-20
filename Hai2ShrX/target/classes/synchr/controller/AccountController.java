package synchr.controller;

import synchr.entity.Account;
import synchr.service.AccountService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller("accountController")
public class AccountController {

    @Resource
    private AccountService accountService;

    public Account findById (int accountId){

            Account account=accountService.findById(accountId);
            return  account;
    }

}
