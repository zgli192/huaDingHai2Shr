package shrCompare.dao;

import org.mybatis.spring.annotation.Mapper;
import shrCompare.entity.OaUser;

import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: 账号的dao接口
 * @author: lizhe zeng
 * @create: 2021-01-29 12:45
 **/

@Mapper("oaUserDao")
public interface OaUserDao {

    List<OaUser> findAll();

    OaUser findById(String code);
}
