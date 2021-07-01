package com.blog.data;

import lombok.Data;

@Data
public class UserData {
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
