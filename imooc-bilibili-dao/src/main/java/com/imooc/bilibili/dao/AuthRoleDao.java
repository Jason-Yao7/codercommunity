package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.auth.AuthRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Shangchen Yao
 * @date 2023/6/9 01:04
 */
@Mapper
public interface AuthRoleDao {
    AuthRole getRoleByCode(String code);
}
