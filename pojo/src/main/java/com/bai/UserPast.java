package com.bai;

public class UserPast {
    private Integer id;

    private Integer userId;

    private Integer videoId;

    private String pastdate;

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

    public String getPastdate() {
        return pastdate;
    }

    public void setPastdate(String pastdate) {
        this.pastdate = pastdate == null ? null : pastdate.trim();
    }
}