package com.blog.mvc.user;

import com.blog.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    public int user_register(UserVO vo){
        return uMap.user_register(vo);
    }
    public UserVO user_login(UserVO vo, HttpServletRequest req) {
        HttpSession session = req.getSession();
        UserVO data = uMap.user_login(vo);

        if(data.getUser_id().equals("")){
            data.setResult(0);
        } else {
            data.setResult(1);
            session.setAttribute("userData",data);
            session.setMaxInactiveInterval(60*60*24);
        }

        return data;
    }
}
