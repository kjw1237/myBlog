package com.blog.mapper.bbs;

import com.blog.mvc.bbs.BbsVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @package : com.blog.mapper.bbs
 * @name : BbsMapper.java
 * @date : 2021/07/01 6:02 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Mapper
public interface BbsMapper {

    int bbs_register(BbsVO bVo);
}
