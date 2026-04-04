package org.tyy.zxy.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文件操作审计日志表
 */
@Data
public class FileOperationLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 日志主键ID
     */
    private Long id;

    /**
     * 操作人用户ID
     */
    private Long userId;

    /**
     * 操作的文件ID
     */
    private Long fileId;

    /**
     * 操作的目录ID
     */
    private Long folderId;

    /**
     * 操作类型：上传、下载、删除、恢复、分享、移动、重命名等
     */
    private String operationType;

    /**
     * 操作详情
     */
    private String operationDetail;

    /**
     * 操作IP地址
     */
    private String operationIp;

    /**
     * 操作时间
     */
    private Date operationTime;
}