package com.blog.controller;

import com.blog.data.UserData;
import org.springframework.jmx.export.metadata.ManagedOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPBinding;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UserController {
    /**ViewResolver가 파일을 찾는 방법
    *
    *컨트롤러에서 리턴값으로 문자를 반환하면 뷰 리졸버가 파일을 찾는데 그 규칙은 다음과 같다.
    *resources/templates/ +{ViewName}+ .html
    *EX) resources/templates/body/user/join.html을 호출하고자 한다면"
    * /body/user/join까지만 적어주면 됨.
     * * **/

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

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public void Register(UserData userData, HttpServletResponse response) throws IOException {

        response.setContentType("text/html; charset=UTF-8");

    }
}
