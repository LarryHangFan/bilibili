package com.example.bilibili.mapper;

import com.example.bilibili.beans.vo.IndexTopSwraper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/19 0019 20:39
 */
@Mapper
public interface SwraperMapper {
  List<IndexTopSwraper> findIndexTopSwraper();
}
