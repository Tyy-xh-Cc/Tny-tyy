package org.tyy.zxy.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文件目录表
 */
@Data
public class FileFolder implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 目录主键ID
     */
    private Long id;

    /**
     * 所属用户ID
     */
    private Long userId;

    /**
     * 父目录ID，0代表根目录
     */
    private Long parentId;

    /**
     * 目录名称
     */
    private String folderName;

    /**
     * 排序号
     */
    private Integer sortNum;

    /**
     * 状态：1-正常 0-删除（回收站）
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