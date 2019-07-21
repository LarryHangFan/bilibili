package com.example.bilibili.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 21:47
 */
@Mapper
public interface VideoCommentMapper {
    List<VideoCommentMapper> getVideoComments(Long videoId);
}
