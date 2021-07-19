package com.blog.mapper.category;

import com.blog.mvc.category.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    int category_register(CategoryVO vo);
    List<CategoryVO> category_list();
}
