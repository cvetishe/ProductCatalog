package com.example.OnlineStore;


public class Products {
    String name;
    int price;
    int id;
    String img;
    String description;


    public Products(int id, String name, int price) {
        this.name = name;
        if(price < 0){
            throw new NullPointerException("Цена меньше 0!");
        }
        this.price = price;
        this.id= id;
    }

    public Products(int id, String name, int price, String img, String description) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.img = img;
        this.description = description;
    }

    public String getDescription() {
        return description;
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

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
