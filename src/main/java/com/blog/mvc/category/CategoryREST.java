package com.blog.mvc.category;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log
public class CategoryREST {

    @Autowired
    private CategoryService cSvc;

    @RequestMapping(value = "/category_list")
    public String category_list(Model model){
        List<CategoryListVO> categoryList = cSvc.category_list();

        model.addAttribute("categoryList", categoryList);
        return "body/board/write";
    }


    @PostMapping(value = "/add_category")
    public int AddCategoryAction(CategoryVO vo){
       int result = cSvc.category_register(vo);
       return result;
    }

    @GetMapping(value = "/del_category")
    public int DelCategoryAction(String categoryArray){
        int result = cSvc.DelCategoryAction(categoryArray);
        return result;
    }
}
