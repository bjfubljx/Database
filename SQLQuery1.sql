if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Login') and o.name = 'FK_LOGIN_USER_LOGI_USER')
alter table Login
   drop constraint FK_LOGIN_USER_LOGI_USER
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Login')
            and   name  = 'User_Login_FK'
            and   indid > 0
            and   indid < 255)
   drop index Login.User_Login_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Login')
            and   type = 'U')
   drop table Login
go

/*==============================================================*/
/* Table: Login                                                 */
/*==============================================================*/
create table Login (
   Login_ID             int                  not null,
   User_ID              int                  not null,
   Login_Type           varchar(50)          not null,
   Login_Ident          varchar(50)          not null,
   Login_Pass           varchar(50)          not null,
   constraint PK_LOGIN primary key nonclustered (Login_ID)
)
go

/*==============================================================*/
/* Index: User_Login_FK                                         */
/*==============================================================*/
create index User_Login_FK on Login (
User_ID ASC
)
go

alter table Login
   add constraint FK_LOGIN_USER_LOGI_USER foreign key (User_ID)
      references "User" (User_ID)
go
