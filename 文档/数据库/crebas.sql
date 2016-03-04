/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/2/25 11:23:30                           */
/*==============================================================*/


drop table if exists dynamic_talk;

drop table if exists jt_org_label;

drop table if exists jt_org_map;

drop table if exists jt_xc;

drop table if exists res_file;

drop table if exists sys_jt;

drop table if exists sys_jtgx;

drop table if exists sys_label;

drop table if exists sys_roles;

drop table if exists sys_state_map;

drop table if exists sys_user;

drop table if exists sys_user_role;

drop table if exists sys_xc;

drop table if exists user_comment;

drop table if exists user_dynamic_image;

drop table if exists user_label_map;

drop table if exists work_book_label;

drop table if exists xc_dtl;

/*==============================================================*/
/* Table: dynamic_talk                                          */
/*==============================================================*/
create table dynamic_talk
(
   talk_id              bigint not null,
   user_id              bigint,
   talk_context         varchar(400),
   has_image            int,
   comment_num          int,
   dian_zhan            int,
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (talk_id)
);

/*==============================================================*/
/* Table: jt_org_label                                          */
/*==============================================================*/
create table jt_org_label
(
   jt_org_label_id      bigint not null,
   label_name           varchar(60),
   label_remark         varchar(200),
   jt_id                bigint,
   jt_nickname          varchar(200),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (jt_org_label_id)
);

/*==============================================================*/
/* Table: jt_org_map                                            */
/*==============================================================*/
create table jt_org_map
(
   jt_org_id            bigint not null,
   jt_nickname          varchar(60),
   jt_id                bigint,
   jt_org_label_id      bigint,
   label_name           varchar(60),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (jt_org_id)
);

/*==============================================================*/
/* Table: jt_xc                                                 */
/*==============================================================*/
create table jt_xc
(
   jt_xc_id             bigint not null,
   sys_xc_id            bigint,
   sys_xc_name          varchar(100),
   jt_id                bigint,
   jt_nickname          varchar(60),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (jt_xc_id)
);

/*==============================================================*/
/* Table: res_file                                              */
/*==============================================================*/
create table res_file
(
   res_id               bigint not null,
   file_url             varchar(400),
   file_name            varchar(200),
   file_code            varchar(200),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (res_id)
);

/*==============================================================*/
/* Table: sys_jt                                                */
/*==============================================================*/
create table sys_jt
(
   jt_id                bigint not null,
   jt_nickname          varchar(60),
   jt_city              varchar(60),
   º“Õ•µÿ÷∑                 varchar(100),
   ji_num               int,
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (jt_id)
);

/*==============================================================*/
/* Table: sys_jtgx                                              */
/*==============================================================*/
create table sys_jtgx
(
   sys_jtgx_id          bigint not null,
   sys_jtgx_name        varchar(50),
   sys_jtgx_remark      varchar(100),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (sys_jtgx_id)
);

/*==============================================================*/
/* Table: sys_label                                             */
/*==============================================================*/
create table sys_label
(
   sys_label_id         bigint not null,
   sys_label_name       varchar(50),
   sys_label_remark     varchar(200),
   sys_user_id          bigint,
   sys_role_name        varchar(50),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (sys_label_id)
);

/*==============================================================*/
/* Table: sys_roles                                             */
/*==============================================================*/
create table sys_roles
(
   sys_role_id          bigint not null,
   sys_role_name        varchar(50),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (sys_role_id)
);

/*==============================================================*/
/* Table: sys_state_map                                         */
/*==============================================================*/
create table sys_state_map
(
   state_id             bigint not null,
   state_code           bigint,
   state_table          varchar(30),
   state_value          varchar(30),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   is_used              int,
   primary key (state_id)
);

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   sys_user_id          bigint not null,
   sys_account          varchar(20),
   sys_password         varchar(20),
   head_url             varchar(200),
   sys_user_nickname    varchar(60),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   jt_id                bigint,
   is_head              int,
   sys_jtgx_id          bigint,
   sys_jtgx_name        varchar(50),
   sys_user_phone2      varchar(30),
   user_email           varchar(50),
   sex                  varchar(6),
   birthday             bigint,
   user_state           int,
   address              varchar(200),
   school               varchar(300),
   primary key (sys_user_id)
);

/*==============================================================*/
/* Table: sys_user_role                                         */
/*==============================================================*/
create table sys_user_role
(
   sys_user_role_id     bigint,
   user_id              bigint,
   user_name            varchar(300),
   role_id              bigint,
   role_name            varchar(200),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int
);

/*==============================================================*/
/* Table: sys_xc                                                */
/*==============================================================*/
create table sys_xc
(
   sys_xc_id            bigint not null,
   sys_xc_name          varchar(100),
   sys_xc_right         int,
   sys_xc_remark        varchar(400),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (sys_xc_id)
);

/*==============================================================*/
/* Table: user_comment                                          */
/*==============================================================*/
create table user_comment
(
   comment_id           bigint not null,
   parent_commnet_id    bigint,
   user_id              bigint,
   commnet_context      varchar(400),
   root_talk_id         bigint,
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (comment_id)
);

/*==============================================================*/
/* Table: user_dynamic_image                                    */
/*==============================================================*/
create table user_dynamic_image
(
   image_url_id         bigint not null,
   talk_id              bigint,
   publish_pic          varchar(300),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (image_url_id)
);

/*==============================================================*/
/* Table: user_label_map                                        */
/*==============================================================*/
create table user_label_map
(
   user_label_map_id    bigint not null,
   sys_label_id         bigint,
   costom_remark        varchar(50),
   sys_user_nickname    varchar(60),
   sys_user_id          bigint,
   sys_label_name       varchar(50),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (user_label_map_id)
);

/*==============================================================*/
/* Table: work_book_label                                       */
/*==============================================================*/
create table work_book_label
(
   wb_lable_id          bigint not null,
   user_id              bigint,
   parent_id            bigint,
   label_name           varchar(200),
   label_remark         varchar(500),
   res_id               bigint,
   is_file              int,
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (wb_lable_id)
);

/*==============================================================*/
/* Table: xc_dtl                                                */
/*==============================================================*/
create table xc_dtl
(
   xc_dtl_id            bigint not null,
   image_dir            varchar(300),
   image_url            varchar(300),
   sys_xc_id            bigint,
   sys_xc_name          varchar(100),
   image_remark         varchar(300),
   create_at            bigint,
   create_id            bigint,
   update_at            bigint,
   update_id            bigint,
   state                int,
   primary key (xc_dtl_id)
);

