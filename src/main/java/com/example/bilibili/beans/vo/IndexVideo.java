package com.example.bilibili.beans.vo;

import lombok.Data;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 17:32
 */
@Data
public class IndexVideo {
    private Long id; //视屏编号
    private String videoImgSrc;//视屏截图地址
    private String descript;//视屏描述
    private Long playCount;//播放量
    private Long commentCount;//视屏评论量
}
