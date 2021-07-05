package com.blog.mvc.user;

import com.blog.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @package : com.blog.mvc.user
 * @name : UserService.java
 * @date : 2021/07/01 6:00 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper uMap;

    public int user_register(UserVO uVo){
        return uMap.user_register(uVo);
    }
    public int user_login(UserVO uVo) { return uMap.user_login(uVo);}
}
