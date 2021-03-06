package cn.iocoder.mall.systemservice.service.systemlog.bo;

import cn.iocoder.common.framework.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
* 系统异常日志分页 BO
*/
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SystemExceptionLogPageBO extends PageParam {

    /**
    * 用户编号
    */
    private Integer userId;
    /**
    * 用户类型
    */
    private Integer userType;
    /**
    * 应用名
     *
     * 目前读取 spring.application.name
    */
    private String applicationName;
    /**
    * 处理状态
    */
    private Integer processStatus;

}
