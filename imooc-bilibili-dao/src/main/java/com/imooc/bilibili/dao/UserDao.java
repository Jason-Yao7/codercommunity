package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.RefreshTokenDetail;
import com.imooc.bilibili.domain.User;
import com.imooc.bilibili.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Shangchen Yao
 * @date 2023/6/4 00:55
 */
@Mapper
public interface UserDao {
    User getUserByPhone(String phone);

    Integer addUser(User user);

    Integer addUserInfo(UserInfo userInfo);

    User getUserById(Long id);

    UserInfo getUserInfoByUserId(Long userId);

    Integer updateUsers(User user);

    User getUserByPhoneOrEmail(@Param("phone") String phone, @Param("email") String email);

    Integer updateUserInfos(UserInfo userInfo);

    List<UserInfo> getUserInfoByUserIds(Set<Long> userIdList);

    Integer pageCountUserInfos(Map<String, Object> params);

    List<UserInfo> pageListUserInfos(Map<String, Object> params);

    Integer deleteRefreshToken(@Param("refreshToken") String refreshToken, @Param("userId") Long userId);

    Integer addRefreshToken(@Param("refreshToken") String refreshToken, @Param("userId") Long userId, @Param("createTime") Date createTime);

    RefreshTokenDetail getRefreshTokenDetail(String refreshToken);

    List<UserInfo> batchGetUserInfoByUserIds(Set<Long> userIdList);
}
