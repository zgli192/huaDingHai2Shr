package synchr;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import shrCompare.Compare;

import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public  void test(){
        Integer a=200;
        Integer b=200;
        Integer a1=2;
        Integer b1=2;
//         // range [-128, 127] must be interned
        System.out.println(a==b); //false   1
        System.out.println(a1==b1); //true  2
        System.out.println("------");
    }
    @Test
    public  void  test1(){
        System.out.println("--kelly");
    }
    @Test
    public  void  test2(){
        Pattern pattern = Pattern.compile("\\d{6}");
        boolean matches = pattern.matcher("100650").matches();
        System.out.println(matches);

    }
    @Test
    public void test3(){
        Compare compare=new Compare();
        compare.getOaTestData();
    }
    @Test
    public void test4(){

//        " 要再java中打出来，必须加\"
        System.out.println("\"");
        System.out.println("\\\"httpMethod\\\"");

        String t = "a||b||c||d";
        String[] temp = t.split("\\|\\|");
        System.out.println(temp.length);
    }
    @Test
    public  void test5(){


            String appKey = "20495950";// 秘钥appkey
            String  appSecret= "gaZKDKeRDkiNjIlShIn1";// 秘钥appSecret


        String postBody = "{\"httpMethod\":\"POST\",\"path\":\"/api/v1/oauth/token\",\"headers\":{},\"query\":{},\"parameter\":{}," +
                "\"contentType\":\"application/x-www-form-urlencoded;charset=UTF-8\",\"mock\":false," +
                "\"appKey\":\"" + appKey + "\",\"appSecret\":\"" + appSecret + "\"}";
        System.out.println("---"+postBody);

        String body="{\"httpMethod\":\"POST\",\"path\":\"/api/v1/oauth/token\",\"headers\":{},\"query\":{},\"parameter\":{},\"contentType\":\"application/x-www-form-urlencoded;charset=UTF-8\",\"mock\":false,\"appKey\":\"20495950\",\"appSecret\":\"gaZKDKeRDkiNjIlShIn1\"}";
    }

}
