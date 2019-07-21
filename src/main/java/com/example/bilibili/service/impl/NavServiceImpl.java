package com.example.bilibili.service.impl;

import com.example.bilibili.mapper.NavMapper;
import com.example.bilibili.beans.vo.IndexTopNav;
import com.example.bilibili.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/19 0019 21:25
 */
@Service
public class NavServiceImpl implements NavService {
    @Autowired
    private NavMapper navMapper;

    @Override
    public List<IndexTopNav> findIndexNav() {
        return navMapper.findNav();
    }
}
