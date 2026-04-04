create table sys_user
(
    id                     bigint auto_increment comment '用户主键ID'
        primary key,
    username               varchar(64)                           not null comment '登录用户名（唯一）',
    password               varchar(128)                          not null comment '加密存储的密码（BCrypt加密）',
    nickname               varchar(64) default ''                null comment '用户昵称',
    total_storage_capacity bigint      default 107374182400      null comment '总存储容量（字节，默认100GB）',
    used_storage_capacity  bigint      default 0                 null comment '已用存储容量（字节）',
    status                 tinyint     default 1                 null comment '用户状态：1-正常 0-禁用',
    create_time            datetime    default CURRENT_TIMESTAMP null comment '创建时间',
    update_time            datetime    default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    constraint uk_username
        unique (username),
    constraint username
        unique (username)
)
    comment '系统用户表';

create index idx_status
    on sys_user (status);

