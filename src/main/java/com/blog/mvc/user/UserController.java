package com.blog.mvc.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @package : com.blog.mvc.user
 * @name : UserController.java
 * @date : 2021/07/01 5:59 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Controller
public class UserController {
    //로그인 페이지 이동
    @RequestMapping(value ="/user/login")
    public ModelAndView openLoginPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body/user/login");
        return mav;
    }
    //가입 페이지 이동
    @RequestMapping(value = "user/join")
    public ModelAndView openJoinPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body/user/join");
        return mav;
    }
}
