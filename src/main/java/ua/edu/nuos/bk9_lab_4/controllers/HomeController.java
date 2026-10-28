package ua.edu.nuos.bk9_lab_4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
class HomeController {

    @GetMapping
    public String home() {
        return "redirect:/car";
    }
}
