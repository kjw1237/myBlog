package com.blog.data;

import lombok.Data;

@Data
public class CommentData {
    /**
     * SYS_COMMENT
     *
     * comment_num          int(11)             NOTNULL
     * commnet_content      varchar(5000)       NOTNULL
     * uid                  varchar(45)         NOTNULL
     * regdate              varchar(45)         NOTNULL
     * moddate              varchar(45)
     * board_num            int(11)
     *
     * **/
    int comment_num;
    String comment_content;
    String uid;
    String regdate;
    String moddate;
    int board_num;
}
