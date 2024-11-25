package com.example.OnlineStore;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ProductService {
    List<Products> productsList = new ArrayList<>();
    List<Basket> basketList = new ArrayList<>();

    public List<Products> fileRead(String file) throws IOException {
        try {
            Scanner read = new Scanner(new File(file));
            int count = 0;
            String name;
            int price;
            while (read.hasNext()){
                String line = read.nextLine();
                name = line.substring(0,line.lastIndexOf(" ")+1);
                price = Integer.parseInt(line.substring(line.lastIndexOf(" ")+1));
                count++;
                productsList.add(new Products(count,name,price));
                System.out.println("файл загружен");
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage()+"файл не загружен");
        }
        return productsList;
    }

    public List<Products> getProductList() throws IOException {
        fileRead("price.txt");
        return productsList;
    }

    public Products getProductId(int id) {
        for (Products product : productsList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void deleteProductId(int id){
        Products p = getProductId(id);
        if(p!=null)
            productsList.remove(p);
    }

//    public  Basket getBasketProd(){
//    }

//    public void delProdBasket(int id){
//        Basket b = ????(id);
//        if(b!=null)
//            productsList.remove(b);
//    } удаление из корзины







}
