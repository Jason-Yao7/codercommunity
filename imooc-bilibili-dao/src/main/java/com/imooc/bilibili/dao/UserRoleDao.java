package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.auth.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Shangchen Yao
 * @date 2023/6/7 16:36
 */
@Mapper
public interface UserRoleDao {

    List<UserRole> getUserRoleByUserId(Long userId);

    Integer addUserRole(UserRole userRole);
}
