package com.example.OnlineStore;

public class Basket {
    String name;
    int price;
    int id;
    String img;

    public Basket(int id, String name, int price) {
       this.id = id;
       this.name = name;
       this.price = price;
    }
    public Basket(int id, String name, int price, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }
}
