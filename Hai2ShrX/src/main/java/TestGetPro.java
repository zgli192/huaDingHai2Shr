/**
 * @program: huaDingHai2Shr
 * @description: 获取配置文件
 * @author: lizhe zeng
 * @create: 2021-01-31 09:08
 **/

//import com.sun.xml.internal.stream.buffer.sax.Properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import synchr.Syn;
import synchr.TestKelly.HelloBean;

//import java.io.InputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class TestGetPro {



    public static void main(String[] args) {
        // 打印路径方式
        System.out.println(TestGetPro.class.getResource("./"));
        System.out.println(TestGetPro.class.getResource("/"));

        TestGetPro testGetPro=new TestGetPro();
        testGetPro.getXml();
    }

    private void  getProperties(){
        Properties properties=new Properties();
        InputStream in= TestGetPro.class.getResourceAsStream("Config/doorMap.properties");
        InputStream ini= TestGetPro.class.getResourceAsStream("/config.properties");
//        System.out.println(ini);
        //TestGetPro.class.getClassLoader().getResourceAsStream("Config/doorMap.properties");
        try{
            properties.load(ini);
            Enumeration enumeration=properties.propertyNames();

            String s=properties.getProperty("USERNAME");
            String s1=properties.getProperty("PWS");
            System.out.println(s1+"*******"+s);
            while (enumeration.hasMoreElements()){
                String strKey=(String)enumeration.nextElement();
                String strValue=properties.getProperty(strKey);
                System.out.println("key:"+strKey+";Value:"+strValue);
            }
        }catch(Exception e){
            System.out.println("There is An IO error!");
        }
    }

    private  void getXml(){

        ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig/beanConfig.xml");
        HelloBean helloBean = (HelloBean)context.getBean("helloBean");
        System.out.println(helloBean.getHolleworld());

        HelloBean helloBean1 =(HelloBean)context.getBean("helloBean2");
        System.out.println(helloBean1.getHolleworld());
    }


}
