
package com.uysys.util.remote.model.tutorial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recent {

    @SerializedName("video_title")
    @Expose
    private String videoTitle;
    @SerializedName("video_subtitle")
    @Expose
    private String videoSubtitle;
    @SerializedName("video_thumbnail")
    @Expose
    private String videoThumbnail;
    @SerializedName("video_link")
    @Expose
    private String videoLink;
    @SerializedName("runtime")
    @Expose
    private String runtime;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoSubtitle() {
        return videoSubtitle;
    }

    public void setVideoSubtitle(String videoSubtitle) {
        this.videoSubtitle = videoSubtitle;
    }

    public String getVideoThumbnail() {
        return videoThumbnail;
    }

    public void setVideoThumbnail(String videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Recent{" +
                "videoTitle='" + videoTitle + '\'' +
                ", videoSubtitle='" + videoSubtitle + '\'' +
                ", videoThumbnail='" + videoThumbnail + '\'' +
                ", videoLink='" + videoLink + '\'' +
                ", runtime='" + runtime + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
