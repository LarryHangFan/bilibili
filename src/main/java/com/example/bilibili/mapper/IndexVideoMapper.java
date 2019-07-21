package com.example.bilibili.mapper;

import com.example.bilibili.beans.vo.IndexVideo;
import com.example.bilibili.beans.vo.VideoDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 17:36
 */
@Mapper
public interface IndexVideoMapper {
    List<IndexVideo> findIndexVideoList();
    List<VideoDetail> findIndexVideoDetail(Integer id);
}
