
package com.uysys.util.remote.model.partners_concern;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("partners")
    @Expose
    private List<Partner> partners = null;
    @SerializedName("concerns")
    @Expose
    private List<Concern> concerns = null;

    public List<Partner> getPartners() {
        return partners;
    }

    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }

    public List<Concern> getConcerns() {
        return concerns;
    }

    public void setConcerns(List<Concern> concerns) {
        this.concerns = concerns;
    }

    @Override
    public String toString() {
        return "Data{" +
                "partners=" + partners +
                ", concerns=" + concerns +
                '}';
    }
}
