package synchr.entity;

import java.io.Serializable;

/**
 * @program: huaDingHai2Shr
 * @description: Account的实体
 * @author: lizhe zeng
 * @create: 2021-01-29 10:45
 **/

public class Account implements Serializable {
    private  Integer id;
    private String name;
    private Float balance;
    @Override
    public String toString() {
        return "Accout{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
