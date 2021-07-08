package com.blog.mvc.bbs;

import com.blog.mapper.bbs.BbsMapper;
import com.blog.mvc.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @package : com.blog.mvc.bbs
 * @name : BbsService.java
 * @date : 2021/07/01 5:59 오후
 * @author : jerrykim
 * @version : 1.0.0
 * @modifyed :
 **/
@Service
public class BbsService {

    @Autowired
    private BbsMapper bMap;

    public int board_register(BbsVO vo){
        return bMap.bbs_register(vo);
    }

}
