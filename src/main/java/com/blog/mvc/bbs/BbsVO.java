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

    private String bbs_code;                 //NOTNULL
    private String bbs_title;                //NOTNULL
    private String bbs_content;              //NOTNULL
    private int hit;
    private String content_img_url;
    private int content_img_byte;
    private String content_img_filename;
    private String create_date;
    private String update_date;
    private String user_id;                  //NOTNULL
    private int ccnt;
    private String category_code;

}
