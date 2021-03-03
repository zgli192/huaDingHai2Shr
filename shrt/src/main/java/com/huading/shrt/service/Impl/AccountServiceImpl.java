package com.huading.shrt.service.Impl;

import com.huading.shrt.entity.result.Account;
import com.huading.shrt.mapper.AccountDao;
import com.huading.shrt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: 获账号的接口实现
 * @author: lizhe zeng
 *
 * 做数据的逻辑控制
 * @create: 2021-01-29 10:51
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
     private AccountDao accountDao;

    @Override
    public void add(Account acount) {

    }

    public void delete(Integer accpuntId) {
        if(accpuntId!=null){
            accountDao.deleteAccount(accpuntId);
        }else {
            System.out.println("填入的Id为空");
        }

    }

    public void update(Account account) {
        accountDao.updateAccount(account);
    }

    public List<Account> findAll() {


        return accountDao.findAllAccount();
    }

    public Account findById(Integer accountId) {
        Account account=null;
        if(accountId!=null&&accountId>1){

             account= accountDao.findById(accountId);
        }else {
            System.out.println("条件控制");
        }
        return  account;

    }
}
