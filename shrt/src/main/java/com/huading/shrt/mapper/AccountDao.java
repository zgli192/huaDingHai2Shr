package com.huading.shrt.mapper;


import com.huading.shrt.entity.result.Account;
import org.springframework.stereotype.Repository;
/*import org.apache.ibatis.annotations.Param;*/

import java.time.LocalDate;
import java.util.List;

/**
 * 补卡
 *
 * @author pengpeng
 * @package com.hdgt.oashr.mapper
 * @project resfDev
 * @date 2021/1/7 13:20
 */
@Repository
public interface AccountDao {
    /**
     * todo
     * @param
     * @return
     */
    void deleteAccount(Integer accountId);

    void updateAccount(Account account);

    List<Account> findAllAccount();

    Account findById(Integer accountId);

}
