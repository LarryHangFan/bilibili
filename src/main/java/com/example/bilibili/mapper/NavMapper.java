package com.example.bilibili.mapper;

import com.example.bilibili.beans.vo.IndexTopNav;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/19 0019 21:22
 */
@Mapper
public interface NavMapper {
    List<IndexTopNav> findNav();
}
