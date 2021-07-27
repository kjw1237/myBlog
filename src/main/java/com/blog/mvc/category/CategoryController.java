package com.blog.mvc.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService cSvc;


    @PostMapping(value = "/category_delete")
    public void category_delete(CategoryVO vo) {
        cSvc.category_delete(vo);
    }

}
