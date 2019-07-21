package com.example.bilibili.beans.vo;

import lombok.Data;

/**
 * @author luohangfan
 * @date 2019/7/20 0020 21:44
 */
@Data
public class VideoComment {
    private String content;
    private String headImgSrc;
    private String createTime;
    private String nickName;
    private Long starCount;
    private Long userId;

}
