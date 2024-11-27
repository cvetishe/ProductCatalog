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

    @GetMapping({"/","/start"})
    public String getAllProducts(Model model) throws IOException {
        model.addAttribute("tab_line",
                productService.getProductList());
            return "start";
    }

    @GetMapping("/line/{id}")
    public String getProductId(@PathVariable int id, Model model) {
        Products p = productService.getProductId(id);
        if (p != null) {
            model.addAttribute("line", p);
            return "page_product";
        }
        return "start";
    }

    @GetMapping("/basket")
    public String getAllBasket(Model model) throws IOException {
        model.addAttribute("tab_line",
                productService.getBasketList());
        if(productService.getBasketList().isEmpty()){
            model.addAttribute("mistake");
        }
        return "basket";
    }

    @GetMapping("/addProd")
    public String addProduct(int id, Model model) {
        Basket basket = productService.addProdId(id);
        if (basket != null) {
            model.addAttribute("line", basket);
            return "addProduct";
        }
        return "start";
    }

    @GetMapping("/delete")
    public String deleteProduct(int id, Model model){
        try {
            Products p = productService.getProductId(id);
            if (p != null) {
                productService.deleteProdId(id);
                model.addAttribute("line", p);
                return "delete";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "start";
    }
}

