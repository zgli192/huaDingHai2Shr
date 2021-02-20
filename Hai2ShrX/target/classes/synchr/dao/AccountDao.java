package synchr.dao;

import org.mybatis.spring.annotation.Mapper;
import synchr.entity.Account;

import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: 账号的dao接口
 * @author: lizhe zeng
 * @create: 2021-01-29 12:45
 **/

@Mapper("accountDao")
public interface AccountDao {
    void addAccount(Account account);

    void deleteAccount(Integer accountId);

    void updateAccount(Account account);

    List<Account> findAllAccount();

    Account findById(Integer accountId);
}
