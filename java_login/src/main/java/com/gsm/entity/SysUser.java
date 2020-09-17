package com.gsm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 后台管理人员账户(SysUser)实体类
 *
 * @author wjq
 * @since 2020-09-17 16:36:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUser {

    private Long userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号
     */
    private String iphoneNo;
    /**
     * 密码明文
     */
    private String po;
    /**
     * 密码密文
     */
    private String pc;
    /**
     * 0失效  1在用
     */
    private Integer status;
    /**
     * 排序
     */
    private Integer showOrder;
    /**
     * 创建时间
     */
    private Date createTime;

}