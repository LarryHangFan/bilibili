package com.example.bilibili.service;

import com.example.bilibili.beans.vo.IndexVideo;
import com.example.bilibili.beans.vo.VideoDetail;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 17:44
 */
public interface IndexVideoService {
    List<IndexVideo> findIndexVideoList();
    List<VideoDetail> findIndexVideoDetail(Integer id);
}
