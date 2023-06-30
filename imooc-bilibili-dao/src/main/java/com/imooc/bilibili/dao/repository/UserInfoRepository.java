package com.imooc.bilibili.dao.repository;

import com.imooc.bilibili.domain.UserInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author Shangchen Yao
 * @date 2023/6/28 02:07
 */
public interface UserInfoRepository extends ElasticsearchRepository<UserInfo, Long> {
}
