
package com.uysys.util.remote.model.classroutine;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("batch_id")
    @Expose
    private String batchId;
    @SerializedName("class_days")
    @Expose
    private List<String> classDays = null;
    @SerializedName("location")
    @Expose
    private String location;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public List<String> getClassDays() {
        return classDays;
    }

    public void setClassDays(List<String> classDays) {
        this.classDays = classDays;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "batchId='" + batchId + '\'' +
                ", classDays=" + classDays +
                ", location='" + location + '\'' +
                '}';
    }
}
