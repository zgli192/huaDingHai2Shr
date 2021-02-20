package synchr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import synchr.TestKelly.HelloBean;
//import synchr.controller.AccountController;
import synchr.controller.AccountController;
import synchr.controller.BlockController;


/**
 * @program: huaDingHai2Shr
 * @description: 主方法
 * @author: lizhe zeng
 * @create: 2021-01-30 18:00
 **/

public class Syn {

    public static void main(String[] args) {


  /*      String conf = "classpath:spring_config/applicationContext-mvc.xml";
        ClassPathXmlApplicationContext ac1 = new ClassPathXmlApplicationContext(conf);*/
        System.out.println("-----程序开始");
        Syn syn=new Syn();
        syn.testGetAccount();

    }

    public  void  testGetKelly(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/springConfig/applicationContext-mvc.xml");
        BlockController blockController=(BlockController)ac.getBean("blockKelly");
        String  s=blockController.blockKe();
        System.out.println("-------"+s);
    }

    public  void testGetAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/springConfig/applicationContext-mvc.xml");

        //ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig/applicationContext-mvc.xml");
        //HelloBean helloBean = (HelloBean)context.getBean("helloBean");
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(context);

        //    1. 如果放bbs在这个static方法中，就不行. 2. 这个getBean 就是controller 类的实例
        AccountController accountController=(AccountController)context.getBean("accountController");
        String testName= accountController.findById(4).getName();
        System.out.println("-----"+testName);

    }

}
