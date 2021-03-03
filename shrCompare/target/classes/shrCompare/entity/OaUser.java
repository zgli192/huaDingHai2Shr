package shrCompare.entity;

/**
 * @program: huaDingHai2Shr
 * @description: OA中用户定义
 * @author: lizhe zeng
 * @create: 2021-02-22 15:19
 **/

public class OaUser {

    private  String  name; // 姓名
    private String unit;//所属部门
    private  String  post; //职位
    private  String  code; // 工号
    private  String  orPost; // 兼职情况
    private  String  phone; // 电话号码
    private  String  mailAddr; // 地址

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getOrPost() {
        return orPost;
    }

    public void setOrPost(String orPost) {
        this.orPost = orPost;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
