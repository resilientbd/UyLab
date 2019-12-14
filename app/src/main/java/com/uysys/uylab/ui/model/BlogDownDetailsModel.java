package com.uysys.uylab.ui.model;

public class BlogDownDetailsModel {
    int mainimage,clockimage,likeimage,designtext,titletext;
    String timetext,liketext;

    public BlogDownDetailsModel(int mainimage, int clockimage, int likeimage, int designtext, int titletext, String timetext, String liketext) {
        this.mainimage = mainimage;
        this.clockimage = clockimage;
        this.likeimage = likeimage;
        this.designtext = designtext;
        this.titletext = titletext;
        this.timetext = timetext;
        this.liketext = liketext;
    }

    public int getMainimage() {
        return mainimage;
    }

    public void setMainimage(int mainimage) {
        this.mainimage = mainimage;
    }

    public int getClockimage() {
        return clockimage;
    }

    public void setClockimage(int clockimage) {
        this.clockimage = clockimage;
    }

    public int getLikeimage() {
        return likeimage;
    }

    public void setLikeimage(int likeimage) {
        this.likeimage = likeimage;
    }

    public int getDesigntext() {
        return designtext;
    }

    public void setDesigntext(int designtext) {
        this.designtext = designtext;
    }

    public int getTitletext() {
        return titletext;
    }

    public void setTitletext(int titletext) {
        this.titletext = titletext;
    }

    public String getTimetext() {
        return timetext;
    }

    public void setTimetext(String timetext) {
        this.timetext = timetext;
    }

    public String getLiketext() {
        return liketext;
    }

    public void setLiketext(String liketext) {
        this.liketext = liketext;
    }

    @Override
    public String toString() {
        return "BlogDownDetailsModel{" +
                "mainimage=" + mainimage +
                ", clockimage=" + clockimage +
                ", likeimage=" + likeimage +
                ", designtext=" + designtext +
                ", titletext=" + titletext +
                ", timetext='" + timetext + '\'' +
                ", liketext='" + liketext + '\'' +
                '}';
    }
}
