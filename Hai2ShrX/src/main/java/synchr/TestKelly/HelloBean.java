package synchr.TestKelly;

/**
 * @program: huaDingHai2Shr
 * @description: 获取xml配置的bean
 * @author: lizhe zeng
 * @create: 2021-02-01 08:57
 **/

public class HelloBean {
    private  String holleworld;

    @Override
    public String toString() {
        return "HelloBean{" +
                "holleworld='" + holleworld + '\'' +
                '}';
    }

    public String getHolleworld() {
        return holleworld;
    }

    public void setHolleworld(String holleworld) {
        this.holleworld = holleworld;
    }
}
