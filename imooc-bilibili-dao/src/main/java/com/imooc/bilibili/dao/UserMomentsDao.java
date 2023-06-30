package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.UserMoment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Shangchen Yao
 * @date 2023/6/6 17:35
 */
@Mapper
public interface UserMomentsDao {
    Integer addUserMoments(UserMoment userMoment);
}
