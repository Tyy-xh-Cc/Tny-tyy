create table file_operation_log
(
    id               bigint auto_increment comment '日志主键ID'
        primary key,
    user_id          bigint                                 not null comment '操作人用户ID',
    file_id          bigint                                 null comment '操作的文件ID',
    folder_id        bigint                                 null comment '操作的目录ID',
    operation_type   varchar(32)                            not null comment '操作类型：上传、下载、删除、恢复、分享、移动、重命名等',
    operation_detail varchar(512) default ''                null comment '操作详情',
    operation_ip     varchar(64)  default ''                null comment '操作IP地址',
    operation_time   datetime     default CURRENT_TIMESTAMP null comment '操作时间'
)
    comment '文件操作审计日志表';

create index idx_operation_time
    on file_operation_log (operation_time);

create index idx_operation_type
    on file_operation_log (operation_type);

create index idx_user_id
    on file_operation_log (user_id);

