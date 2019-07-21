package com.example.bilibili.service;

import com.example.bilibili.beans.vo.IndexTopNav;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/19 0019 21:24
 */
public interface NavService{
    List<IndexTopNav> findIndexNav();
}
