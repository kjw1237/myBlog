package com.blog.mvc.bbs;

import lombok.Data;
/**
 * @package : com.blog.mvc.bbs
 * @name : BbsVO.java
 * @date : 2021/07/01 6:00 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Data
public class BbsVO {
    /**
     * SYS_BBS
     *
     * board_num        varchar(11)         NOTNULL
     * board_title      varchar(100)        NOTNULL
     * board_content    varchar(5000)       NOTNULL
     * category1        varchar(45)         NOTNULL
     * category2        varchar(45)         NOTNULL
     * tag              varchar(300)
     * regdate          varchar(45)         NOTNULL
     * moddate          varchar(45)
     * img              varchar(100)
     * uid              varchar(45)         NOTNULL
     * hit              int(11)
     * **/

    private String board_num;
    private String board_title;
    private String board_content;
    private String category1;
    private String category2;
    private String tag;
    private String regdate;
    private String moddate;
    private String img;
    private String uid;
    private int hit;
    private String test;
}
