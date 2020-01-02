
package com.uysys.util.remote.model.list_offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offer {

    @SerializedName("offer_category_id")
    @Expose
    private Integer offerCategoryId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("valid_till")
    @Expose
    private String validTill;
    @SerializedName("banner_original_url")
    @Expose
    private String bannerOriginalUrl;
    @SerializedName("banner_thumbnail_url")
    @Expose
    private String bannerThumbnailUrl;

    public Integer getOfferCategoryId() {
        return offerCategoryId;
    }

    public void setOfferCategoryId(Integer offerCategoryId) {
        this.offerCategoryId = offerCategoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
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

    @Override
    public String toString() {
        return "Offer{" +
                "offerCategoryId=" + offerCategoryId +
                ", title='" + title + '\'' +
                ", validTill='" + validTill + '\'' +
                ", bannerOriginalUrl='" + bannerOriginalUrl + '\'' +
                ", bannerThumbnailUrl='" + bannerThumbnailUrl + '\'' +
                '}';
    }
}
