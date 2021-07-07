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

    private int result;
    private String msg;
    private String user_code="";            //NOTNULL
    private String user_id="";              //NOTNULL
    private String user_pwd;                //NOTNULL
    private String user_name;               //NOTNULL
    private String email;                   //NOTNULL
    private int eamil_status;               //NOTNULL
    private int mod_status;                 //NOTNULL
    private String create_date;
    private String update_date;
    private String login_date;
    private String profile_img_url;
    private int profile_img_byte;
    private String profile_img_filename;
    private int google_status;
    private int kakao_status;
    private String google_user_code;
    private String kakao_user_code;
    private String user_flag;               //NOTNULL
}
