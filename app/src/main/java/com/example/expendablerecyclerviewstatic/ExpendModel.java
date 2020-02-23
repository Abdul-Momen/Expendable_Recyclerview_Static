package com.example.expendablerecyclerviewstatic;

public class ExpendModel {
    int image;
    String title,chail_1,chaid_2;

    public ExpendModel() {
    }

    public ExpendModel(int image, String title, String chail_1, String chaid_2) {
        this.image = image;
        this.title = title;
        this.chail_1 = chail_1;
        this.chaid_2 = chaid_2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChail_1() {
        return chail_1;
    }

    public void setChail_1(String chail_1) {
        this.chail_1 = chail_1;
    }

    public String getChaid_2() {
        return chaid_2;
    }

    public void setChaid_2(String chaid_2) {
        this.chaid_2 = chaid_2;
    }
}
