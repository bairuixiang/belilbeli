package com.bai;

import java.util.Date;

public class InsertCion {
    private Integer id;

    private Integer userId;

    private Integer videoId;

    private Integer cionnum;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getCionnum() {
        return cionnum;
    }

    public void setCionnum(Integer cionnum) {
        this.cionnum = cionnum;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}