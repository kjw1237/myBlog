package com.blog.data;

import lombok.Data;

@Data
public class BoardData {
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

    String board_num;
    String board_title;
    String board_content;
    String category1;
    String category2;
    String tag;
    String regdate;
    String moddate;
    String img;
    String uid;
    int hit;
    String test;
}
