package com.example.OnlineStore;

public class Basket {
    String name;
    int price;
    int id;
    int idImg;

    public Basket(int id, String name, int price) {
       this.id = id;
       this.name = name;
       this.price = price;
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

    public int getIdImg() {
        return idImg;
    }
}
