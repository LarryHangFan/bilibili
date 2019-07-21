package com.example.bilibili.controller;

import com.alibaba.fastjson.JSON;

import com.example.bilibili.beans.vo.IndexTopNav;
import com.example.bilibili.service.NavService;
import com.example.bilibili.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luohangfan
 * @date 2019/7/19 0019 21:16
 */
@RestController
@RequestMapping("/bili")
public class NavController {
    @Autowired
    private NavService navService;

    @RequestMapping("/nav")
    @ResponseBody
    public String getIndexNavList(){
        List<IndexTopNav> indexTopNavs = navService.findIndexNav();

        return JSON.toJSONString(ResultUtil.ok(indexTopNavs));
    }

}
