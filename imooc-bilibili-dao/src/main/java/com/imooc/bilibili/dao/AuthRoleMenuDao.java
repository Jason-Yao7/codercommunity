package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.auth.AuthRoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Shangchen Yao
 * @date 2023/6/7 17:21
 */
@Mapper
public interface AuthRoleMenuDao {
    List<AuthRoleMenu> getAuthRoleMenusByRoleIds(Set<Long> roleIdSet);
}
