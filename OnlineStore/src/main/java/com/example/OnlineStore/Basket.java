package com.example.OnlineStore;

public class Basket {
    Products products;
    String name;
    int price;
    int count;
    int id;

    public Basket(String name, int price, int id){
        this.id=id;
        this.name=name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", id=" + id +
                '}';
    }
}
