
package com.uysys.util.remote.model.Seminar_Enrollment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeminarEnrollment {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("messages")
    @Expose
    private List<String> messages = null;
    @SerializedName("data")
    @Expose
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SeminarEnrollment{" +
                "code=" + code +
                ", messages=" + messages +
                ", data=" + data +
                '}';
    }
}
