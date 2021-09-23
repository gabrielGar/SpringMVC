package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlController {
    @GetMapping("/greeting")
    public String Greet(@RequestParam(name="user",defaultValue = "Stranger", required = false) String user,
                        Model model)
    {
        model.addAttribute("name", user);
        return "greeting";
    }
}
