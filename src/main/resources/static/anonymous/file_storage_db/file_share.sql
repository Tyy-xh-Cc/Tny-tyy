create table file_share
(
    id              bigint auto_increment comment '分享主键ID'
        primary key,
    user_id         bigint                               not null comment '分享人用户ID',
    file_id         bigint                               not null comment '分享的文件ID',
    share_code      varchar(32)                          not null comment '分享唯一码（用于分享链接）',
    extraction_code varchar(8) default ''                null comment '提取码，为空则无提取码',
    view_count      int        default 0                 null comment '查看次数',
    download_count  int        default 0                 null comment '转存/下载次数',
    expire_time     datetime                             null comment '过期时间，为空则永久有效',
    status          tinyint    default 1                 null comment '状态：1-有效 0-已取消 2-已过期',
    create_time     datetime   default CURRENT_TIMESTAMP null comment '分享创建时间',
    constraint share_code
        unique (share_code),
    constraint uk_share_code
        unique (share_code)
)
    comment '文件分享表';

create index idx_file_id
    on file_share (file_id);

create index idx_status_expire
    on file_share (status, expire_time);

create index idx_user_id
    on file_share (user_id);

