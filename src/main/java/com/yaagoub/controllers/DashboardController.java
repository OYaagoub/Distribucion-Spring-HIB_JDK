package com.yaagoub.controllers;

import com.yaagoub.entities.ClientData;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DashboardController {
    @GetMapping("dashboard")
    public String dashboard(){
        return "dashboard";
    }
    @PostMapping("insertClientData")
    public String insertClientData(@ModelAttribute("newClientData") @Valid ClientData clientData, BindingResult result, Model modelo){
        return "redirect:dashboard";
    }
    @PostMapping("deleteClientData")
    public String DeleteClientData(Model model){
        return "redirect:dashboard";
    }
}
