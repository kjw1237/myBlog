package com.blog.mapper.category;

import com.blog.mvc.category.CategoryListVO;
import com.blog.mvc.category.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    int category_register(CategoryVO vo);
    List<CategoryListVO> category_list();
    int category_delete(CategoryVO vo);

    void DelCategoryAction(String s);
}
