package com.imooc.bilibili.service;

import com.imooc.bilibili.dao.FollowingGroupDao;
import com.imooc.bilibili.domain.FollowingGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shangchen Yao
 * @date 2023/6/4 18:36
 */
@Service
public class FollowingGroupService {

    @Autowired
    private FollowingGroupDao followingGroupDao;

    public FollowingGroup getByType(String type) {
        return followingGroupDao.getByType(type);
    }

    public FollowingGroup getById(Long id) {
        return followingGroupDao.getById(id);
    }

    public List<FollowingGroup> getByUserId(Long userId) {
        return followingGroupDao.getByUserId(userId);
    }

    public void addFollowingGroup(FollowingGroup followingGroup) {
        followingGroupDao.addFollowingGroup(followingGroup);
    }

    public List<FollowingGroup> getuserFollowingGroups(Long userId) {
        return followingGroupDao.getUserFollowingGroups(userId);
    }
}
