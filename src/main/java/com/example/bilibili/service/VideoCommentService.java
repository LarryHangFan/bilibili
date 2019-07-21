package com.example.bilibili.service;

import com.example.bilibili.mapper.VideoCommentMapper;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 21:58
 */
public interface VideoCommentService {
    List<VideoCommentMapper> getVideoComments(Long videoId);
}
