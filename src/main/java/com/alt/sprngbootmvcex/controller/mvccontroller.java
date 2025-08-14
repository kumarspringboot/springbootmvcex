package com.alt.sprngbootmvcex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/welcome")  //controller mapping
public class mvccontroller {

    @GetMapping("/wish")  //request method mapping
    public String welcome() {
        return "index"; //logical view name
    }

    @GetMapping("/greet")  //request method mapping
    public String welcomeMsg(Model model) {
        model.addAttribute("msg","welcome t sprngb");
        return "greeting"; //logical view name
    }
}
