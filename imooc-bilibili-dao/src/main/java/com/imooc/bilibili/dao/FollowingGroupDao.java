package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.FollowingGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Shangchen Yao
 * @date 2023/6/4 18:35
 */
@Mapper
public interface FollowingGroupDao {
    FollowingGroup getByType(String type);

    FollowingGroup getById(Long id);

    List<FollowingGroup> getByUserId(Long userId);

    Integer addFollowingGroup(FollowingGroup followingGroup);

    List<FollowingGroup> getUserFollowingGroups(Long userId);
}
