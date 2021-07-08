package com.blog.mvc.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @package : com.blog.mvc.bbs
 * @name : BbsController.java
 * @date : 2021/07/01 6:00 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Controller
public class BbsController {

    @Autowired
    private BbsService bSvc;


    //게시글 작성 페이지 이동
    @RequestMapping(value = "board/write")
    public ModelAndView openWritePage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body/board/write");
        return mav;
    }
    //게시글 상세 페이지 이동
    @RequestMapping(value = "board/info")
    public ModelAndView openInfoPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body/board/info");
        return mav;
    }
    //게시글 수정 페이지 이동
    @RequestMapping(value = "board/mod")
    public ModelAndView openModPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body/board/mod");
        return mav;
    }
    //게시글 리스트 페이지 이동
    @RequestMapping(value = "board/list")
    public ModelAndView openListPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body/board/list");
        return mav;
    }
    //게시글 리스트 페이지 이동
    @RequestMapping(value = "board/reply_mod")
    public ModelAndView openReplyModPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body/board/reply_mod");
        return mav;
    }

    @RequestMapping(value = "/board_register" , method = RequestMethod.POST)
    public void board_res(BbsVO vo ,  HttpServletResponse res) throws IOException {
        int result = bSvc.board_register(vo);

        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        if (result == 1) {
            out.println("<script>alert('게시글이 등록 되었습니다'); location.href='/user/login';</script>");
        } else {
            out.println("<script>alert('게시글 등록 실패.'); location.href='/user/join';</script>");
        }
        out.flush();
    }
}
