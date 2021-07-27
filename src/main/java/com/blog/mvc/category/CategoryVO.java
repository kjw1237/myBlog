package com.blog.mvc.category;

import lombok.Data;

import java.util.List;

@Data
public class CategoryVO {
    private String category_name;
    private List<CategoryListVO> voList;
}
