## majiang community


## 资料
[Spring 文档][https://spring.io/guides]   
[导航栏文档][https://spring.io/guides/gs/serving-web-content/]   
[Githhub OAuth 建立文档][https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/]  
[Web APPlication 流程][https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/] 
[OkHttp][https://square.github.io/okhttp/]  
[Maven 仓库][https://mvnrepository.com/]  
[MySQL][https://www.runoob.com/mysql/mysql-update-query.html]   
[mybatis-spring-boot-autoconfigure][http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/index.html]    
[Spring 文档(DataBase)][https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/html/boot-features-sql.html]

## 工具
[Git 工具][https://git-scm.com/]  
[visual Paradigm][https://www.visual-paradigm.com]

## 脚本
```sql
-- auto-generated definition
create table USER
(
    ID           INTEGER default  auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);


```