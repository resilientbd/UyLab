
package com.uysys.util.remote.model.seminar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seminar {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("seminar_category_id")
    @Expose
    private Integer seminarCategoryId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("duration")
    @Expose
    private String duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeminarCategoryId() {
        return seminarCategoryId;
    }

    public void setSeminarCategoryId(Integer seminarCategoryId) {
        this.seminarCategoryId = seminarCategoryId;
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

}
