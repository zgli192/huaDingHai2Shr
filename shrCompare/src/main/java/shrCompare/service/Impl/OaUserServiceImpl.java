package shrCompare.service.Impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import shrCompare.dao.OaUserDao;
import shrCompare.entity.OaUser;
import shrCompare.service.OaUserService;
import shrCompare.utils.StringUtil;


import javax.annotation.Resource;
import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: 获的接口实现
 * @author: lizhe zeng
 *
 * 做数据的逻辑控制
 * @create: 2021-01-29 10:51
 **/
@Service("oaUserService")
public class OaUserServiceImpl implements OaUserService {

    private static final Logger LOGGER = Logger.getLogger(OaUserServiceImpl.class);
    @Resource
    private OaUserDao oaUserDao;

    public List<OaUser> findAll() {


        return oaUserDao.findAll();
    }


    @Override
    public OaUser findById(String id) {
        OaUser oaUser=null;
        if(StringUtil.is6Number(id)&&StringUtil.isNotEmpty(id)){
             oaUser= oaUserDao.findById(id);
        }else {
            LOGGER.info("请检查输入工号");
        }
        return  oaUser;

    }
}
