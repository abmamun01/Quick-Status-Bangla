package com.example.awesome_qoute_app.RecyclerModel;

public class RecyclerModel {


    int image1,image2,image3;
    String qoute;

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public String getQoute() {
        return qoute;
    }

    public void setQoute(String qoute) {
        this.qoute = qoute;
    }

    public RecyclerModel() {
    }

    public RecyclerModel(int image1, int image2, int image3, String qoute) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.qoute = qoute;
    }
}
