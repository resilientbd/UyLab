
package com.uysys.util.remote.model.paymentSummary;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("course_name")
    @Expose
    private String courseName;
    @SerializedName("batch_id")
    @Expose
    private String batchId;
    @SerializedName("date_of_admission")
    @Expose
    private String dateOfAdmission;
    @SerializedName("amount_payable")
    @Expose
    private String amountPayable;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("total_paid")
    @Expose
    private Integer totalPaid;
    @SerializedName("total_due")
    @Expose
    private Integer totalDue;
    @SerializedName("installments")
    @Expose
    private List<Installment> installments = null;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getAmountPayable() {
        return amountPayable;
    }

    public void setAmountPayable(String amountPayable) {
        this.amountPayable = amountPayable;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Integer totalPaid) {
        this.totalPaid = totalPaid;
    }

    public Integer getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(Integer totalDue) {
        this.totalDue = totalDue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "courseName='" + courseName + '\'' +
                ", batchId='" + batchId + '\'' +
                ", dateOfAdmission='" + dateOfAdmission + '\'' +
                ", amountPayable='" + amountPayable + '\'' +
                ", discount=" + discount +
                ", totalPaid=" + totalPaid +
                ", totalDue=" + totalDue +
                ", installments=" + installments +
                '}';
    }
}
