package org.tyy.zxy.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 笔记本（文件夹）
 * @TableName notebook
 */
@TableName(value ="notebook")
@Data
public class Notebook {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 所属用户
     */
    private Long userId;

    /**
     * 父笔记本ID，NULL表示根目录
     */
    private Long parentId;

    /**
     * 笔记本名称
     */
    private String name;

    /**
     * 排序权重
     */
    private Integer sortOrder;

    /**
     * 逻辑删除标记
     */
    private Integer isDeleted;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private Date updatedAt;
}