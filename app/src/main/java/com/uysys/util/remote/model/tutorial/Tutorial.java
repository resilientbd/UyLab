
package com.uysys.util.remote.model.tutorial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tutorial {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("messages")
    @Expose
    private List<Object> messages = null;
    @SerializedName("data")
    @Expose
    private Data data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Object> getMessages() {
        return messages;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "code=" + code +
                ", messages=" + messages +
                ", data=" + data +
                '}';
    }
}
