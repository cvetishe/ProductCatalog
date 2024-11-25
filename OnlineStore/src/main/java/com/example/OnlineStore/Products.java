package com.example.OnlineStore;


public class Products {
    ProductService productServise;
    String name;
    int price;
    int id;


    public Products(int id, String name, int price) {
        this.name = name;
        if(price < 0){
            throw new NullPointerException("Цена меньше 0!");
        }
        this.price = price;
        this.id= id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
        return "Products{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

}
