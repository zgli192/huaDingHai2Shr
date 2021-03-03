package com.huading.shrt.entity.log;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/*import javax.validation.constraints.NotNull;*/

/**
 * 日志查询对象
 *
 * @author pengpeng
 * @package com.hdgt.oashr.entity.log
 * @project oashr
 * @date 2021/1/15 11:41
 */
@Data
public class LogSearchQO {
    private Long id;
    /**
     * 类型 打卡数据
     */
    private String type;
    /**
     * 操作描述
     */
    private String discripte;
    /**
     * 操作目标是数据id
     */
    private Long opdataId;
    private String status;
    private String createTimeStart;
    private String createTimeEnd;
    private String lastupdateTimeStart;
    private String lastupdateTimeEnd;
    private Integer page;
    private Integer pageSize;
}
