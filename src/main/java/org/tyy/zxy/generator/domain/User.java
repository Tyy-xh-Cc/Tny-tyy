package org.tyy.zxy.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

/**
 * 用户表
 * @TableName user
 */
@Data
@TableName(value ="user")
public class User {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮箱
     */
    @Email(message = "请输入有效地址")
    private String email;
    /**
     * 密码哈希
     */
    @NotBlank(message = "密码不能为空")
    @Size(min = 8 ,max = 16,message = "")
    private String passwordHash;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 已用存储(字节)
     */
    private Long storageUsed;

    /**
     * 存储上限(默认1G)
     */
    private Long storageLimit;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private Date updatedAt;
}