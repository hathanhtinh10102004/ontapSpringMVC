package com.example.btbotuc3.controller;


import com.example.btbotuc3.model.Bt;
import com.example.btbotuc3.service.BtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bts")
public class BtController {
    @Autowired
    private BtService btService;
    @GetMapping()
    public String bt(Model model){
        List<Bt> BtList = btService.getBtList();
        model.addAttribute("bt" , BtList);
        return "/home";
    }

    @GetMapping("/add-bt")
    public String addBtForm(Model model){
        Bt bt = new Bt();
        model.addAttribute("bt", bt);
        return "/create";
    }
    @PostMapping("/create")
    public String createBt(@ModelAttribute Bt bt){
        btService.createBt(bt);

        return "redirect:/bts";
    }

    @GetMapping("/edit/{id}")
    public String editBtForm(@PathVariable int id , Model model){
        Bt bt = btService.getBtById(id);
        model.addAttribute("bt", bt);
        return "/edit";
    }
    @PostMapping("/edit")
    public String updateBt(@ModelAttribute Bt bt){
        btService.updateBt(bt);
        return "redirect:/bts";
    }
    @GetMapping("/delete/{id}")
    public String deleteBt(@PathVariable int id){
        btService.deleteBt(id);
        return "redirect:/bts";
    }

}
