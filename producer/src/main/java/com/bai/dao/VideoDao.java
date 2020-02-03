package com.bai.dao;

import com.bai.Video;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoDao {

    //上传视频
    int addVideo(Video video);

    //删除视频
    int deleteVideo(int id);

    //修改视频
    int updateVideo(Video video);

    //查询上传视频
    Video selUpVideo(int userId);

    //查询收藏视频
}
