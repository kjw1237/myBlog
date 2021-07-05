package com.blog.mapper.user;

import com.blog.mvc.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @package : com.blog.mapper.user
 * @name : UserMapper.java
 * @date : 2021/07/01 6:02 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/

@Mapper
public interface UserMapper {


    int user_register(UserVO uVo);
    int user_login(UserVO uVO);


}
