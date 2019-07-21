package com.example.bilibili.controller;

import com.alibaba.fastjson.JSON;
import com.example.bilibili.service.VideoCommentService;
import com.example.bilibili.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 22:01
 */
@RestController
@RequestMapping("/bili")
public class VideoCommentController {

    @Autowired
    private VideoCommentService videoCommentService;

    @RequestMapping("/comment")
    public String getVideoComments(Long videoId){
        return JSON.toJSONString(
                ResultUtil.ok(
                        videoCommentService.getVideoComments(videoId)
                )
        );
    }
}
