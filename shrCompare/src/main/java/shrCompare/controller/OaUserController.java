package shrCompare.controller;

import org.springframework.stereotype.Controller;
import shrCompare.entity.OaUser;
import shrCompare.service.OaUserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: OaUser控制层
 * @author: lizhe zeng
 * @create: 2021-02-22 17:16
 **/
@Controller("oaUserController")
public class OaUserController {
    @Resource
    private OaUserService oaUserService;

    public OaUser findById(String id){
        OaUser oaUser=oaUserService.findById(id);
        return  oaUser;
    }
    public List<OaUser> findAll(){
        List<OaUser> oaUsers = oaUserService.findAll();
        return  oaUsers;
    }

}
