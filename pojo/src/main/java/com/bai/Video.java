package com.bai;

import java.util.Date;

public class Video {
    private Integer videoId;

    private String videoName;

    private String videoMsg;

    private String videoImg;

    private String videoSrc;

    private Integer videoType;

    private Integer userId;

    private Date ctime;

    private Integer videoLooknum;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoMsg() {
        return videoMsg;
    }

    public void setVideoMsg(String videoMsg) {
        this.videoMsg = videoMsg == null ? null : videoMsg.trim();
    }

    public String getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg == null ? null : videoImg.trim();
    }

    public String getVideoSrc() {
        return videoSrc;
    }

    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc == null ? null : videoSrc.trim();
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getVideoLooknum() {
        return videoLooknum;
    }

    public void setVideoLooknum(Integer videoLooknum) {
        this.videoLooknum = videoLooknum;
    }
}