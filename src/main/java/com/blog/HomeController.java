package com.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


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
        mav.setViewName("index");
        return mav;
    }


}
