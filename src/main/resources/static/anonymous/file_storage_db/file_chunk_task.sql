create table file_chunk_task
(
    id              bigint auto_increment comment '分片任务主键ID'
        primary key,
    user_id         bigint                                  not null comment '所属用户ID',
    task_id         varchar(64)                             not null comment '分片任务唯一ID（一般用MD5+用户ID生成）',
    origin_filename varchar(255)                            not null comment '原始文件名',
    file_md5        varchar(32)                             not null comment '文件整体MD5值',
    file_size       bigint                                  not null comment '文件总大小（字节）',
    chunk_size      int                                     not null comment '每个分片的大小（字节，一般5MB）',
    total_chunk     int                                     not null comment '总分片数量',
    uploaded_chunk  varchar(1024) default ''                null comment '已上传的分片序号列表（逗号分隔，如1,2,3）',
    folder_id       bigint        default 0                 null comment '要保存的目标目录ID',
    status          tinyint       default 0                 null comment '任务状态：0-上传中 1-已完成 2-已取消 3-已过期',
    create_time     datetime      default CURRENT_TIMESTAMP null comment '任务创建时间',
    expire_time     datetime                                not null comment '任务过期时间（默认7天，过期自动清理）',
    constraint task_id
        unique (task_id),
    constraint uk_task_id
        unique (task_id)
)
    comment '大文件分片上传任务表';

create index idx_file_md5
    on file_chunk_task (file_md5);

create index idx_status_expire
    on file_chunk_task (status, expire_time);

create index idx_user_id
    on file_chunk_task (user_id);

