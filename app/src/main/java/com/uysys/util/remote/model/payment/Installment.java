
package com.uysys.util.remote.model.payment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Installment {

    @SerializedName("installment_date")
    @Expose
    private String installmentDate;
    @SerializedName("installment_amount")
    @Expose
    private String installmentAmount;
    @SerializedName("status")
    @Expose
    private Integer status;

    public String getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(String installmentDate) {
        this.installmentDate = installmentDate;
    }

    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Installment{" +
                "installmentDate='" + installmentDate + '\'' +
                ", installmentAmount='" + installmentAmount + '\'' +
                ", status=" + status +
                '}';
    }
}
