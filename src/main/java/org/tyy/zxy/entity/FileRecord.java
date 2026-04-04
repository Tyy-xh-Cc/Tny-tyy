package org.tyy.zxy.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 核心文件记录表
 */
@Data
public class FileRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 文件主键ID
     */
    private Long id;

    /**
     * 所属用户ID
     */
    private Long userId;

    /**
     * 所属目录ID，0代表根目录
     */
    private Long folderId;

    /**
     * 原始文件名（用户上传的名称）
     */
    private String originFilename;

    /**
     * 存储文件名（唯一，避免重名覆盖，一般用UUID/雪花ID）
     */
    private String storageFilename;

    /**
     * 文件存储全路径（本地/对象存储路径）
     */
    private String storagePath;

    /**
     * 文件MD5值（用于秒传、完整性校验）
     */
    private String fileMd5;

    /**
     * 文件大小（字节）
     */
    private Long fileSize;

    /**
     * 文件MIME类型（如image/png、application/pdf）
     */
    private String fileType;

    /**
     * 文件后缀（如png、pdf、mp4）
     */
    private String fileSuffix;

    /**
     * 是否公开：0-私有 1-公开可访问
     */
    private Byte isPublic;

    /**
     * 文件状态：1-正常 0-删除（回收站） 2-禁用
     */
    private Byte status;

    /**
     * 下载次数
     */
    private Integer downloadCount;

    /**
     * 上传时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除时间（用于回收站过期自动清理）
     */
    private Date deleteTime;
}