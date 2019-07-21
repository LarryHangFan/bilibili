package com.example.bilibili.controller;

import com.alibaba.fastjson.JSON;
import com.example.bilibili.service.IndexVideoService;
import com.example.bilibili.util.ResultUtil;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 17:47
 */
@RestController
@RequestMapping("/bili")
public class IndexVideoController {
    @Autowired
    private IndexVideoService indexVideoService;

    @RequestMapping("/video")
    public String getIndexVideoList(){
        return JSON.toJSONString(
                ResultUtil.ok(
                        indexVideoService.findIndexVideoList()
                )
        );
    }

    @RequestMapping("/video/detail")
    public String getVideoDetail(Integer id){
        return JSON.toJSONString(
                ResultUtil.ok(
                        indexVideoService.findIndexVideoDetail(id)
                )
        );
    }
}
