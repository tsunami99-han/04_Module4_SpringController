package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/sandwiches")
    public String showForm() {
        return "form";
    }

    @RequestMapping("/save")
    public String save(Model model, @RequestParam(name = "condiment", required = false) String[] condiment) {
        String result = "";
        try {
            for (String value: condiment) {
                if (!value.equals("") && value != null) {
                    result += value + " ";
                }
            }
        } catch (NullPointerException e) {
        } finally {
            if (result.equals(""))
                model.addAttribute("result", "No condiments");
            else
                model.addAttribute("result", result);
        }
        return "form";
    }
}