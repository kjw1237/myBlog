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
    private int result;
    private String uid;
    private String upwd;
    private String uname;
    private String uemail;
    private String email_flag;
    private String pwd_flag;
    private String flag;
    private String regdate;
    private String moddate;
}
