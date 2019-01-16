/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/1/15 11:07:24                           */
/*==============================================================*/


drop table if exists user;

drop table if exists userdetail;

drop table if exists userlog;

drop table if exists userrec;

drop table if exists usershell;

drop table if exists usersignin;

drop table if exists userwallet;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null,
   phone                varchar(15),
   password             varchar(50),
   flag                 smallint,
   primary key (id)
);

/*==============================================================*/
/* Table: userdetail                                            */
/*==============================================================*/
create table userdetail
(
   uid                  int not null,
   nickname             varchar(20),
   sex                  smallint,
   birthday             date,
   headimg              varchar(100),
   sign                 varchar(50),
   email                varchar(50),
   recode               varchar(50),
   primary key (uid)
);

/*==============================================================*/
/* Table: userlog                                               */
/*==============================================================*/
create table userlog
(
   id                   bigint not null,
   type                 smallint,
   content              varchar(50),
   createtime           datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: userrec                                               */
/*==============================================================*/
create table userrec
(
   id                   int not null,
   toid                 int,
   beid                 int,
   shell                int,
   createtime           datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: usershell                                             */
/*==============================================================*/
create table usershell
(
   id                   bigint not null,
   shell                int,
   startdate            date,
   enddate              date,
   type                 smallint,
   primary key (id)
);

/*==============================================================*/
/* Table: usersignin                                            */
/*==============================================================*/
create table usersignin
(
   id                   bigint not null,
   uid                  int,
   signtime             datetime,
   shell                int,
   primary key (id)
);

/*==============================================================*/
/* Table: userwallet                                            */
/*==============================================================*/
create table userwallet
(
   uid                  int not null,
   totalshell           int,
   consumeshell         int,
   expireshell          int,
   moneyshell           int,
   flag                 smallint,
   primary key (uid)
);

