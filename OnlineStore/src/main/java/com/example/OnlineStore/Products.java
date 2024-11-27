package com.example.OnlineStore;


public class Products {
    String name;
    int price;
    int id;
    int idImg;


    public Products(int id, String name, int price) {
        this.name = name;
        if(price < 0){
            throw new NullPointerException("Цена меньше 0!");
        }
        this.price = price;
        this.id= id;
    }

    public Products(int id, String name, int price, int idImg) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.idImg = idImg;
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

    @Override
    public String toString() {
        return "Products{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

}
