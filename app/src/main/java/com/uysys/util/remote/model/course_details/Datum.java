
package com.uysys.util.remote.model.course_details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("course_duration")
    @Expose
    private String courseDuration;
    @SerializedName("class_duration")
    @Expose
    private String classDuration;
    @SerializedName("total_class")
    @Expose
    private Integer totalClass;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("contact_number")
    @Expose
    private String contactNumber;
    @SerializedName("curriculum")
    @Expose
    private String curriculum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getClassDuration() {
        return classDuration;
    }

    public void setClassDuration(String classDuration) {
        this.classDuration = classDuration;
    }

    public Integer getTotalClass() {
        return totalClass;
    }

    public void setTotalClass(Integer totalClass) {
        this.totalClass = totalClass;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", classDuration='" + classDuration + '\'' +
                ", totalClass=" + totalClass +
                ", icon='" + icon + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", curriculum='" + curriculum + '\'' +
                '}';
    }
}
