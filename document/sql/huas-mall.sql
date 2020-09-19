/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/9/19 20:12:30                           */
/*==============================================================*/


drop table if exists admin;

drop table if exists "order";

drop table if exists order_details;

drop table if exists product;

drop table if exists shopping_cart;

drop table if exists sort;

drop table if exists user;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   adminId              varchar(20) not null,
   adminName            varchar(20) not null,
   password             varchar(10) not null,
   permissions          int not null,
   primary key (adminId)
);

/*==============================================================*/
/* Table: "order"                                               */
/*==============================================================*/
create table "order"
(
   orderId              varchar(20) not null,
   orderNo              varchar(20) not null,
   userId               varchar(20) not null,
   sendName             varchar(20) not null,
   sendAddress          varchar(20) not null,
   sendZip              varchar(8),
   sendTel              varchar(11) not null,
   payment              varchar(20) not null,
   meno                 varchar(200),
   time                 datetime not null,
   tag                  int not null,
   primary key (orderId)
);

/*==============================================================*/
/* Table: order_details                                         */
/*==============================================================*/
create table order_details
(
   detailsId            varchar(20) not null,
   orderId              varchar(20) not null,
   prold                varchar(20),
   proId                varchar(20) not null,
   price                double not null,
   count                int not null,
   primary key (detailsId)
);

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create temporary table product
(
   prold                varchar(20) not null,
   sorld                varchar(20) not null,
   proName              varchar(20) not null,
   saleCount            varchar(20) not null,
   image                varchar(100),
   price                double not null,
   salePrice            double not null,
   decript              varchar(256),
   saleDate             datetime,
   primary key (prold)
);

/*==============================================================*/
/* Table: shopping_cart                                         */
/*==============================================================*/
create table shopping_cart
(
   id                   varchar(20) not null,
   userId               varchar(20) not null,
   prold                varchar(20) not null,
   count                int not null,
   primary key (id)
);

/*==============================================================*/
/* Table: sort                                                  */
/*==============================================================*/
create table sort
(
   sorld                varchar(20) not null,
   sorName              varchar(20) not null,
   primary key (sorld)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   userId               varchar(20) not null,
   username             varchar(20) not null,
   password             varchar(10) not null,
   realName             varchar(10),
   tel                  int not null,
   address              varchar(20) not null,
   zip                  varchar(8),
   email                varbinary(50),
   primary key (userId)
);

alter table "order" add constraint FK_Reference_5 foreign key (userId)
      references user (userId) on delete restrict on update restrict;

alter table order_details add constraint FK_Reference_4 foreign key (orderId)
      references "order" (orderId) on delete restrict on update restrict;

alter table order_details add constraint FK_Reference_6 foreign key (prold)
      references product (prold) on delete restrict on update restrict;

alter table product add constraint FK_Reference_3 foreign key (sorld)
      references sort (sorld) on delete restrict on update restrict;

alter table shopping_cart add constraint FK_Reference_1 foreign key (userId)
      references user (userId) on delete restrict on update restrict;

alter table shopping_cart add constraint FK_Reference_2 foreign key (prold)
      references product (prold) on delete restrict on update restrict;

