package com.example.OnlineStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String getAllProducts1(Model model) throws IOException {
        model.addAttribute("tab_product", productService.getProductList());
        return "start";
    }

    @GetMapping("/start")
    public String index2(){
        return "start";
    }

    @GetMapping("/allProducts")
    public String getAllProducts(int id, String name, int price,Model model) throws IOException {
        Products p = new Products(id,name,price);
        model.addAttribute("s",productService.getProductList().toString());
        model.addAttribute("tab_lines", productService.productsList);
        return "start";
    }

    @GetMapping("/line/{id}")
    public String getProductId(@PathVariable int id, Model model) {
        Products product = productService.getProductId(id);
        if (product != null) {
            model.addAttribute("line", product);
            return "page_product";
        }
        return "start";
    }


}
