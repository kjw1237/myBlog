package com.blog.mvc.category;

import com.blog.mapper.category.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper cMap;

    public int category_register(CategoryVO vo )  { return cMap.category_register(vo); }

    public List<CategoryListVO> category_list() { return cMap.category_list(); }

    public int category_delete(CategoryVO vo) {


        return  cMap.category_delete(vo);
    }

    public int DelCategoryAction(String categoryArray) {
        String[] array = categoryArray.split(",");
        try{
            for(int i=0; i<array.length; i++){
                cMap.DelCategoryAction(array[i]);
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}