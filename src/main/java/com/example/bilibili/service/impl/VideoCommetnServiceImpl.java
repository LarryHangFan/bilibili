package com.example.bilibili.service.impl;

import com.example.bilibili.mapper.VideoCommentMapper;
import com.example.bilibili.service.VideoCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 21:59
 */
@Service
public class VideoCommetnServiceImpl implements VideoCommentService {
    @Autowired
    private VideoCommentMapper videoCommentMapper;
    @Override
    public List<VideoCommentMapper> getVideoComments(Long videoId) {
        return videoCommentMapper.getVideoComments(videoId);
    }
}
