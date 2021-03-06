package com.blog.mvc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

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

    @Autowired
    private UserService uSvc;

    //로그인 페이지 이동
    @RequestMapping(value = "/user/login")
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

    @RequestMapping(value = "/user_register", method = RequestMethod.POST)
    public void register(UserVO VO, HttpServletResponse response) throws IOException {

        int result = uSvc.user_register(VO);

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (result == 1) {
            out.println("<script>alert('계정이 등록 되었습니다'); location.href='/user/login';</script>");
        } else {
            out.println("<script>alert('회원가입 실패.'); location.href='/user/join';</script>");
        }
        out.flush();

    }

    @RequestMapping(value = "/user_login")
    public void login(UserVO vo, HttpServletRequest req, HttpServletResponse res) throws IOException{
        UserVO result = uSvc.user_login(vo,req);
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        if (result.getResult() == 0) {
            out.println("<script>alert('"+result.getMsg()+"'); location.href='/user/login';</script>");
        } else {
            out.println("<script>location.href='/';</script>");
        }
        out.flush();
    }

    @GetMapping(value = "user/logout")
    public String logout(HttpServletRequest req){
        HttpSession session = req.getSession();
        session.invalidate();
        return "redirect:/";
    }
}