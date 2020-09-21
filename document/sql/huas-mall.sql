/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/9/20 12:54:32                           */
/*==============================================================*/


drop table if exists admin;

drop table if exists order_details;

drop table if exists orders;

drop table if exists product;

drop table if exists shopping_cart;

drop table if exists sort;

drop table if exists user;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   adminId              varchar(20) not null comment '管理员编号',
   adminName            varchar(20) not null comment '分类名',
   password             varchar(10) not null comment '密码',
   permissions          int not null comment '权限',
   primary key (adminId)
);

/*==============================================================*/
/* Table: order_details                                         */
/*==============================================================*/
create table order_details
(
   detailsId            varchar(20) not null comment '订单详情编号',
   orderId              varchar(20) not null comment '订单编号',
   prold                varchar(20) comment '商品编号',
   price                double not null comment '对应价格',
   count                int not null comment '订购数量',
   primary key (detailsId)
);

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   orderId              varchar(20) not null comment '订单编号',
   orderNo              varchar(20) not null comment '生成订单的编号',
   userId               varchar(20) not null comment '会员编号',
   sendName             varchar(20) not null comment '收货姓名',
   sendAddress          varchar(20) not null comment '收货地址',
   sendZip              varchar(8) comment '收货邮编',
   sendTel              varchar(11) not null comment '收货人电话',
   payment              varchar(20) not null comment '付款方式',
   meno                 varchar(200) comment '备注说明',
   time                 datetime not null comment '订单生成时间',
   tag                  int not null comment '订单处理标记',
   primary key (orderId)
);

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create  table product
(
   prold                varchar(20) not null comment '商品编号',
   sorld                varchar(20) not null comment '商品分类编号',
   proName              varchar(20) not null comment '商品名',
   saleCount            varchar(20) not null comment '销售数量',
   image                varchar(100) comment '图片路径',
   price                double not null comment '成本价格',
   salePrice            double not null comment '销售价格',
   decript              varchar(200) comment '商品介绍',
   saleDate             datetime comment '销售时间',
   primary key (prold)
);

/*==============================================================*/
/* Table: shopping_cart                                         */
/*==============================================================*/
create table shopping_cart
(
   id                   varchar(20) not null comment 'id',
   userId               varchar(20) not null comment '会员编号',
   prold                varchar(20) not null comment '商品编号',
   count                int not null comment '商品数量',
   primary key (id)
);

/*==============================================================*/
/* Table: sort                                                  */
/*==============================================================*/
create table sort
(
   sorld                varchar(20) not null comment '商品分类编号',
   sorName              varchar(20) not null comment '分类名',
   primary key (sorld)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   userId               varchar(20) not null comment '会员编号',
   username             varchar(20) not null comment '会员名',
   password             varchar(10) not null comment '密码',
   realName             varchar(10) comment '真实姓名',
   tel                  int not null comment '电话',
   address              varchar(20) not null comment '地址',
   zip                  varchar(8) comment '邮政编码',
   email                varbinary(50) comment '电子邮件',
   primary key (userId)
);

alter table order_details add constraint FK_Reference_4 foreign key (orderId)
      references orders (orderId) on delete restrict on update restrict;

alter table order_details add constraint FK_Reference_6 foreign key (prold)
      references product (prold) on delete restrict on update restrict;

alter table orders add constraint FK_Reference_5 foreign key (userId)
      references user (userId) on delete restrict on update restrict;

alter table product add constraint FK_Reference_3 foreign key (sorld)
      references sort (sorld) on delete restrict on update restrict;

alter table shopping_cart add constraint FK_Reference_1 foreign key (userId)
      references user (userId) on delete restrict on update restrict;

alter table shopping_cart add constraint FK_Reference_2 foreign key (prold)
      references product (prold) on delete restrict on update restrict;

