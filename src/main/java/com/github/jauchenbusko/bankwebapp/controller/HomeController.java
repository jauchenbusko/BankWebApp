package com.github.jauchenbusko.bankwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome in EB Bank");
        model.addAttribute("tagline", "Best Unique Bank Ever!");

        return "welcome";
    }
}
