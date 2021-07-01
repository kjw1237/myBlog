package com.blog.mapper;

import com.blog.data.UserData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int register(UserData udata);

}
