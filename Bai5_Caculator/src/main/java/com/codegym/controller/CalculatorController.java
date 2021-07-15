package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.invoke.SwitchPoint;

@Controller
public class CalculatorController {

    @GetMapping("/calculators")
    public String showForm() {
        return "index";
    }

    @RequestMapping("/calculate")
    public String calculate(Model model, @RequestParam double value1, double value2, String cal) {
        switch (cal) {
            case "add":
                double result = value1 + value2;
                model.addAttribute("result", result);
                break;
            case "sub":
                result = value1 - value2;
                model.addAttribute("result", result);
                break;
            case "mul":
                result = value1 * value2;
                model.addAttribute("result", result);
                break;
            case "div":
                if (value2 == 0) {
                    model.addAttribute("result", "Can't divide by 0");
                } else {
                    result = value1 / value2;
                    model.addAttribute("result", result);
                }
                break;
        }
        return "index";
    }


}