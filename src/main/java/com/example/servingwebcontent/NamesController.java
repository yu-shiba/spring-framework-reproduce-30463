package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("names")
@SessionAttributes(names = { "pet" })
public class NamesController {

    @GetMapping("step1")
    public String step1(Pet pet, Model model) {
        return "step1";
    }

    @GetMapping("step2")
    public String step2(Model model) {
        return "step2";
    }
}
