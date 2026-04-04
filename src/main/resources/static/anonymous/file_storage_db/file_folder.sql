create table file_folder
(
    id          bigint auto_increment comment '目录主键ID'
        primary key,
    user_id     bigint                             not null comment '所属用户ID',
    parent_id   bigint   default 0                 null comment '父目录ID，0代表根目录',
    folder_name varchar(128)                       not null comment '目录名称',
    sort_num    int      default 0                 null comment '排序号',
    status      tinyint  default 1                 null comment '状态：1-正常 0-删除（回收站）',
    create_time datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '文件目录表';

create index idx_status
    on file_folder (status);

create index idx_user_parent
    on file_folder (user_id, parent_id);

