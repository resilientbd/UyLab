
package com.uysys.util.remote.model.mentor_profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SocialProfile {

    @SerializedName("facebook_profile_url")
    @Expose
    private String facebookProfileUrl;
    @SerializedName("linkedin_profile_url")
    @Expose
    private String linkedinProfileUrl;
    @SerializedName("twitter_profile_url")
    @Expose
    private String twitterProfileUrl;

    public String getFacebookProfileUrl() {
        return facebookProfileUrl;
    }

    public void setFacebookProfileUrl(String facebookProfileUrl) {
        this.facebookProfileUrl = facebookProfileUrl;
    }

    public String getLinkedinProfileUrl() {
        return linkedinProfileUrl;
    }

    public void setLinkedinProfileUrl(String linkedinProfileUrl) {
        this.linkedinProfileUrl = linkedinProfileUrl;
    }

    public String getTwitterProfileUrl() {
        return twitterProfileUrl;
    }

    public void setTwitterProfileUrl(String twitterProfileUrl) {
        this.twitterProfileUrl = twitterProfileUrl;
    }

    @Override
    public String toString() {
        return "SocialProfile{" +
                "facebookProfileUrl='" + facebookProfileUrl + '\'' +
                ", linkedinProfileUrl='" + linkedinProfileUrl + '\'' +
                ", twitterProfileUrl='" + twitterProfileUrl + '\'' +
                '}';
    }
}
