
package com.uysys.util.remote.model.mentor_profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("social_profile")
    @Expose
    private SocialProfile socialProfile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public SocialProfile getSocialProfile() {
        return socialProfile;
    }

    public void setSocialProfile(SocialProfile socialProfile) {
        this.socialProfile = socialProfile;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", bio='" + bio + '\'' +
                ", photo='" + photo + '\'' +
                ", socialProfile=" + socialProfile +
                '}';
    }
}
