package com.huading.shrt.entity.result;

import java.io.Serializable;

/**
 * @author pengpeng
 * @package com.cn.xiaonuo.modular.model
 * @project xiaonuo-layui
 * @date 2021/2/4 14:34
 */

public class ResultVO implements Serializable {

    private String code;
    private String message;
    private Integer totals;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultVO(){
        this.code="200";
        this.totals =0;
    }

    public ResultVO notfound(){
        this.code="404";
        this.totals =0;
        return this;
    }

}
