package com.project.kafka.api.multipartition.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class Post {
    private String username;
    private String status;
    private Integer followersCount;
    @DateTimeFormat(pattern = "dd/MM/yyyy | hh:mm")
    private LocalDateTime postDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userName='" + username + '\'' +
                ", status='" + status + '\'' +
                ", followersCount=" + followersCount +
                ", postDate=" + postDate +
                '}';
    }
}
