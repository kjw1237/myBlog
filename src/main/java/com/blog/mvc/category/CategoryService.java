package com.blog.mvc.category;

import com.blog.mapper.category.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper cMap;

    public int category_register(CategoryVO vo){ return cMap.category_register(vo); }
    public List<CategoryVO> category_list() { return cMap.category_list(); }

}
