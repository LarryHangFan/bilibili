package com.example.bilibili.controller;

import com.alibaba.fastjson.JSON;
import com.example.bilibili.service.IndexSwraperService;
import com.example.bilibili.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luohangfan
 * @date 2019/7/19 0019 20:32
 */
@RestController
@RequestMapping("/bili")
public class SwraperController {

    @Autowired
    private IndexSwraperService indexSwraperService;
   /**
    * @author luohangfan
    * @date 2019-07-19 
    * @return * @param null
    * @throws 
    * @since
   */
    @RequestMapping("/swraper")
    public String  getIndexSwraper(){
     return JSON.toJSONString(
             ResultUtil.ok(
             indexSwraperService.getIndexSwraper()));
    }

}
