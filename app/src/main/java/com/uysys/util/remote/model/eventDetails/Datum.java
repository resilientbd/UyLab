
package com.uysys.util.remote.model.eventDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("event_category_id")
    @Expose
    private Integer eventCategoryId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("banner_original_url")
    @Expose
    private String bannerOriginalUrl;
    @SerializedName("banner_thumbnail_url")
    @Expose
    private String bannerThumbnailUrl;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("category")
    @Expose
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventCategoryId() {
        return eventCategoryId;
    }

    public void setEventCategoryId(Integer eventCategoryId) {
        this.eventCategoryId = eventCategoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBannerOriginalUrl() {
        return bannerOriginalUrl;
    }

    public void setBannerOriginalUrl(String bannerOriginalUrl) {
        this.bannerOriginalUrl = bannerOriginalUrl;
    }

    public String getBannerThumbnailUrl() {
        return bannerThumbnailUrl;
    }

    public void setBannerThumbnailUrl(String bannerThumbnailUrl) {
        this.bannerThumbnailUrl = bannerThumbnailUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", eventCategoryId=" + eventCategoryId +
                ", title='" + title + '\'' +
                ", startDate='" + startDate + '\'' +
                ", duration='" + duration + '\'' +
                ", description='" + description + '\'' +
                ", bannerOriginalUrl='" + bannerOriginalUrl + '\'' +
                ", bannerThumbnailUrl='" + bannerThumbnailUrl + '\'' +
                ", status=" + status +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", category=" + category +
                '}';
    }
}
