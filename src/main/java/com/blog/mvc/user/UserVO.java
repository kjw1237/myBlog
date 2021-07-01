package com.blog.mvc.user;

import lombok.Data;

/**
 * @package : com.blog.mvc.user
 * @name : UserVO.java
 * @date : 2021/07/01 6:00 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Data
public class UserVO {
    /**
     * USER
     *
     * uid          varchar(45)         NOTNULL
     * upwd         varchar(100)        NOTNULL
     * uname        varchar(30)         NOTNULL
     * uemail       varchar(45)         NOTNULL
     * email_flag   varchar(45)         NOTNULL
     * pwd_flag     varchar(45)         NOTNULL
     * flag         varchar(45)         NOTNULL
     * regdate      varchar(45)         NOTNULL
     * moddate      varchar(45)
     * **/
    int result;
    String uid;
    String upwd;
    String uname;
    String uemail;
    String email_flag;
    String pwd_flag;
    String flag;
    String regdate;
    String moddate;
}
