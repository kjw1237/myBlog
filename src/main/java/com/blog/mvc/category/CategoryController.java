package com.blog.mvc.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService cSvc;

    @RequestMapping(value = "/category_register" , method = RequestMethod.POST)
    public void category_res(CategoryVO vo , HttpServletResponse res) throws IOException {
        int result = cSvc.category_register(vo);

        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        if (result == 1) {
            out.println("<script>alert('카테고리가 등록 되었습니다');</script>");
        } else {
            out.println("<script>alert('카테고리 등록 실패.');</script>");
        }
        out.flush();
    }
    //카테고리 리스트 출력
    @RequestMapping(value = "/category_list")
    public ModelAndView category_list(){
        List<CategoryVO> categoryList = cSvc.category_list();
        ModelAndView mav = new ModelAndView("body/board/write");
        //addObject("변수명" , 변수에 넣을 데이터)
        mav.addObject("categoryList", cSvc.category_list());

        return mav;
    }
}
