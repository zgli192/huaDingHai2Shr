package shrCompare;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shrCompare.controller.OaUserController;
import shrCompare.entity.OaUser;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.util.List;

/**
 * @program: huaDingHai2Shr
 * @description: 对比
 * @author: lizhe zeng
 * @create: 2021-02-22 17:27
 **/

public class Compare {
    private static final Logger LOGGER = Logger.getLogger(Compare.class);

    public  void getOaTestData(){
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext
                ("/springConfig/applicationContext-mvc.xml");
        OaUserController oaUserController=(OaUserController)context.getBean("oaUserController");
        OaUser oaUser=oaUserController.findById("100650");
       /*   这个不行
       JSONObject jsonObj = new JSONObject();//new一个JSON
        jsonObj.put("oaUser",oaUser );//total代表一共有多少数据
        System.out.println(oaUser);*/
        String str = JSONObject.toJSONString(oaUser, SerializerFeature.DisableCircularReferenceDetect);
        System.out.println(str);

        List<OaUser> oaUsers=oaUserController.findAll();
        System.out.println(oaUsers.get(30).getName()+"-----"+oaUsers.get(20).getPost());

    }

    public void before(){
        System.out.println("程序开始--------");
    }
    public static void main(String[] args) {
        Compare compare=new Compare();
        compare.getOaTestData();
    }

}
