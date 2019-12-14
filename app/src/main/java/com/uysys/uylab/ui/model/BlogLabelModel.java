package com.uysys.uylab.ui.model;

public class BlogLabelModel {
    int mainimage,imagecircle,icon;
    int title;
    String shorttitle,time;

    public BlogLabelModel(int mainimage, int imagecircle, int icon, int title, String shorttitle, String time) {
        this.mainimage = mainimage;
        this.imagecircle = imagecircle;
        this.icon = icon;
        this.title = title;
        this.shorttitle = shorttitle;
        this.time = time;
    }

    public int getMainimage() {
        return mainimage;
    }

    public void setMainimage(int mainimage) {
        this.mainimage = mainimage;
    }

    public int getImagecircle() {
        return imagecircle;
    }

    public void setImagecircle(int imagecircle) {
        this.imagecircle = imagecircle;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getShorttitle() {
        return shorttitle;
    }

    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "BlogLabelModel{" +
                "mainimage=" + mainimage +
                ", imagecircle=" + imagecircle +
                ", icon=" + icon +
                ", title=" + title +
                ", shorttitle='" + shorttitle + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
