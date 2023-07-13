package com.example.hanif;

public class Model {
    String foodname;
    int foodimage;

    public Model(String foodname, int foodimage) {
        this.foodname = foodname;
        this.foodimage = foodimage;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getFoodimage() {
        return foodimage;
    }

    public void setFoodimage(int foodimage) {
        this.foodimage = foodimage;
    }
}
