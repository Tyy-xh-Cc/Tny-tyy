package org.tyy.zxy.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统用户表
 */
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户主键ID
     */
    private Long id;

    /**
     * 登录用户名（唯一）
     */
    private String username;

    /**
     * 加密存储的密码（BCrypt加密）
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 总存储容量（字节，默认100GB）
     */
    private Long totalStorageCapacity;

    /**
     * 已用存储容量（字节）
     */
    private Long usedStorageCapacity;

    /**
     * 用户状态：1-正常 0-禁用
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}