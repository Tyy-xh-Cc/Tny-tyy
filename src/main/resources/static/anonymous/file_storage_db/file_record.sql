create table file_record
(
    id               bigint auto_increment comment '文件主键ID'
        primary key,
    user_id          bigint                             not null comment '所属用户ID',
    folder_id        bigint   default 0                 null comment '所属目录ID，0代表根目录',
    origin_filename  varchar(255)                       not null comment '原始文件名（用户上传的名称）',
    storage_filename varchar(255)                       not null comment '存储文件名（唯一，避免重名覆盖，一般用UUID/雪花ID）',
    storage_path     varchar(512)                       not null comment '文件存储全路径（本地/对象存储路径）',
    file_md5         varchar(32)                        not null comment '文件MD5值（用于秒传、完整性校验）',
    file_size        bigint                             not null comment '文件大小（字节）',
    file_type        varchar(100)                       null comment '文件MIME类型（如image/png、application/pdf）',
    file_suffix      varchar(32)                        null comment '文件后缀（如png、pdf、mp4）',
    is_public        tinyint  default 0                 null comment '是否公开：0-私有 1-公开可访问',
    status           tinyint  default 1                 null comment '文件状态：1-正常 0-删除（回收站） 2-禁用',
    download_count   int      default 0                 null comment '下载次数',
    create_time      datetime default CURRENT_TIMESTAMP null comment '上传时间',
    update_time      datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    delete_time      datetime                           null comment '删除时间（用于回收站过期自动清理）'
)
    comment '核心文件记录表';

create index idx_create_time
    on file_record (create_time);

create index idx_file_md5
    on file_record (file_md5);

create index idx_status
    on file_record (status);

create index idx_user_folder
    on file_record (user_id, folder_id);

