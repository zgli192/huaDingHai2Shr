package synchr.service;
//import synchr.entity.Account;

import synchr.entity.Account;

import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: 获取账号接口
 * @author: lizhe zeng
 * @create: 2021-01-29 10:38
 **/
public interface AccountService {


    void add(Account acount);

    void delete(Integer accpuntId);

    void update (Account account);

    List<Account> findAll();

    Account findById(Integer accountId);
}