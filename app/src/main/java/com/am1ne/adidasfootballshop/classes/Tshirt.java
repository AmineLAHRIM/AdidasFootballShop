package com.am1ne.adidasfootballshop.classes;

public class Tshirt {

    private int price;
    private String kit_name;
    private int img;

    public Tshirt(int price, String kit_name, int img) {
        this.price = price;
        this.kit_name = kit_name;
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKit_name() {
        return kit_name;
    }

    public void setKit_name(String kit_name) {
        this.kit_name = kit_name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
