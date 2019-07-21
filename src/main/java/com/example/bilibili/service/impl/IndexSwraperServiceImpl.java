package com.example.bilibili.service.impl;

import com.example.bilibili.beans.vo.IndexTopSwraper;
import com.example.bilibili.mapper.SwraperMapper;
import com.example.bilibili.service.IndexSwraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 15:37
 */
@Service
public class IndexSwraperServiceImpl implements IndexSwraperService {
    @Autowired
    private SwraperMapper swraperMapper;

    @Override
    public List<IndexTopSwraper> getIndexSwraper() {
        return swraperMapper.findIndexTopSwraper();
    }
}
