package com.example.bilibili.service.impl;

import com.example.bilibili.beans.vo.IndexVideo;
import com.example.bilibili.beans.vo.VideoDetail;
import com.example.bilibili.mapper.IndexVideoMapper;
import com.example.bilibili.service.IndexVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 17:44
 */
@Service
public class IndexVideoServiceImpl implements IndexVideoService {
    @Autowired
    private IndexVideoMapper indexVideoMapper;

    @Override
    public List<IndexVideo> findIndexVideoList() {
        return indexVideoMapper.findIndexVideoList();
    }

    @Override
    public List<VideoDetail> findIndexVideoDetail(Integer id) {
        return indexVideoMapper.findIndexVideoDetail(id);
    }
}
