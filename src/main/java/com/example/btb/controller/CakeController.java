package com.example.btb.controller;

import com.example.btb.model.Cake;
import com.example.btb.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cakes")
public class CakeController {
    @Autowired
    private CakeService cakeService;
    @GetMapping()
    public String allCake(Model model){
        List<Cake> cakes = cakeService.getAllListCake();
        model.addAttribute("cars" , cakes);
        return "/list";
    }

    @GetMapping("/add-cake")
    public String showAddCakeForm(Model model) {
        Cake Cake = new Cake();
        model.addAttribute("cake", Cake);

        return "create";
    }

    @PostMapping("/create")
    public String createCake(@ModelAttribute Cake cake) {
        cakeService.createCake(cake);
        return "redirect:/cakes";
    }
    @GetMapping("/edit/{id}")
    public String showEditCakeForm(@PathVariable int id, Model model) {

        model.addAttribute("cake", cakeService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String updateCake(@ModelAttribute Cake cake) {
        cakeService.updateCake(cake);

        return "redirect:/cakes";
    }
}
