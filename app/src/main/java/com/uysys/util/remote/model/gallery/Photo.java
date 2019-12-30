
package com.uysys.util.remote.model.gallery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("gallery_category_id")
    @Expose
    private Integer galleryCategoryId;
    @SerializedName("original_url")
    @Expose
    private String originalUrl;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;

    public Integer getGalleryCategoryId() {
        return galleryCategoryId;
    }

    public void setGalleryCategoryId(Integer galleryCategoryId) {
        this.galleryCategoryId = galleryCategoryId;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "galleryCategoryId=" + galleryCategoryId +
                ", originalUrl='" + originalUrl + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                '}';
    }
}
