package com.example.bilibili.beans.vo;

import lombok.Data;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 18:40
 */
@Data
public class VideoDetail {
    private Long id;//视屏编号
    private String author;//视屏作者
    private String videoSrc;//视屏地址
    private Long playCount;//播放量
    private  String createTime;//视屏上传日期
    private Long commentCount;//视屏评论量
    private String desc;//视屏详情
}
