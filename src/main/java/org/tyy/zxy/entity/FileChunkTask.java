package org.tyy.zxy.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 大文件分片上传任务表
 */
@Data
public class FileChunkTask implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 分片任务主键ID
     */
    private Long id;

    /**
     * 所属用户ID
     */
    private Long userId;

    /**
     * 分片任务唯一ID（一般用MD5+用户ID生成）
     */
    private String taskId;

    /**
     * 原始文件名
     */
    private String originFilename;

    /**
     * 文件整体MD5值
     */
    private String fileMd5;

    /**
     * 文件总大小（字节）
     */
    private Long fileSize;

    /**
     * 每个分片的大小（字节，一般5MB）
     */
    private Integer chunkSize;

    /**
     * 总分片数量
     */
    private Integer totalChunk;

    /**
     * 已上传的分片序号列表（逗号分隔，如1,2,3）
     */
    private String uploadedChunk;

    /**
     * 要保存的目标目录ID
     */
    private Long folderId;

    /**
     * 任务状态：0-上传中 1-已完成 2-已取消 3-已过期
     */
    private Byte status;

    /**
     * 任务创建时间
     */
    private Date createTime;

    /**
     * 任务过期时间（默认7天，过期自动清理）
     */
    private Date expireTime;
}