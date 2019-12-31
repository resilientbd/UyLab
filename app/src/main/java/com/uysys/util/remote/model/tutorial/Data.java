
package com.uysys.util.remote.model.tutorial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("popular")
    @Expose
    private List<Popular> popular = null;
    @SerializedName("recent")
    @Expose
    private List<Recent> recent = null;

    public List<Popular> getPopular() {
        return popular;
    }

    public void setPopular(List<Popular> popular) {
        this.popular = popular;
    }

    public List<Recent> getRecent() {
        return recent;
    }

    public void setRecent(List<Recent> recent) {
        this.recent = recent;
    }

    @Override
    public String toString() {
        return "Data{" +
                "popular=" + popular +
                ", recent=" + recent +
                '}';
    }
}
