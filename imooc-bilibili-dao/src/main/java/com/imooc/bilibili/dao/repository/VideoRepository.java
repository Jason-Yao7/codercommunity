package com.imooc.bilibili.dao.repository;

import com.imooc.bilibili.domain.Video;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author Shangchen Yao
 * @date 2023/6/28 01:04
 */
public interface VideoRepository extends ElasticsearchRepository<Video, Long> {


    Video findByTitleLike(String keyword);
}
