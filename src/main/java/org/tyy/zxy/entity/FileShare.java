package org.tyy.zxy.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文件分享表
 */
@Data
public class FileShare implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 分享主键ID
     */
    private Long id;

    /**
     * 分享人用户ID
     */
    private Long userId;

    /**
     * 分享的文件ID
     */
    private Long fileId;

    /**
     * 分享唯一码（用于分享链接）
     */
    private String shareCode;

    /**
     * 提取码，为空则无提取码
     */
    private String extractionCode;

    /**
     * 查看次数
     */
    private Integer viewCount;

    /**
     * 转存/下载次数
     */
    private Integer downloadCount;

    /**
     * 过期时间，为空则永久有效
     */
    private Date expireTime;

    /**
     * 状态：1-有效 0-已取消 2-已过期
     */
    private Byte status;

    /**
     * 分享创建时间
     */
    private Date createTime;
}