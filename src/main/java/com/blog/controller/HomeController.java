package com.blog.controller;

import com.blog.data.RouteVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @package : com.blog.controller
 * @name : HomeController.java
 * @date : 2021/07/01 6:05 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Controller
public class HomeController {
    @GetMapping(value = "/")
    public ModelAndView Index(Model model){
        ModelAndView mav = new ModelAndView();
        RouteVo vo = new RouteVo();
        vo.setRoute("body");
        vo.setFileName("main");
        vo.setAlias("bodyMain");
        mav.addObject("voData", vo);
        mav.setViewName("index");

        return mav;
    }


}
