package shrCompare.service;


import shrCompare.entity.OaUser;

import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: 获取账号接口
 * @author: lizhe zeng
 * @create: 2021-01-29 10:38
 **/
public interface OaUserService {

    List<OaUser> findAll();

    OaUser findById(String Id);
}