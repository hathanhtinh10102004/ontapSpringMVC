package com.example.btbotuc1.controller;


import com.example.btbotuc1.model.Product;
import com.example.btbotuc1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public String showHomePage(Model model) {
        List<Product> lists = productService.getAllProduct();

        model.addAttribute("listProduct", lists);
        return "/index";
    }

    @GetMapping("/add-product")
    public String showProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "/create";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        productService.createProduct(product);
        redirectAttributes.addFlashAttribute("message", "Create successfully");
        return "redirect:/products";
    }

    @GetMapping("/delete/{count}")
    public String deleteProduct(@ModelAttribute("product") Product product , @PathVariable String count){
        int id = Integer.parseInt(count) -1;
        productService.deleteProduct(id);
        return "redirect:/products";
    }

    @GetMapping("/edit-product/{count}")
    public String editProductForm(@PathVariable int count, Model model) {
        int id = count - 1;
        Product product = productService.findById(id);
        product.setId(id);
        model.addAttribute("product", product);
        return "/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.update(product.getId() ,product);
        return "redirect:/products";
    }
}
