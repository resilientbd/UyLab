
package com.uysys.util.remote.model.upcoming_batches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("batches")
    @Expose
    private List<Batch> batches = null;

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

    public List<Batch> getBatches() {
        return batches;
    }

    public void setBatches(List<Batch> batches) {
        this.batches = batches;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batches=" + batches +
                '}';
    }
}
