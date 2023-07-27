package myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(Model model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hi!");
        messages.add("Click on the button you will see users");
        model.addAttribute("messages", messages);
        return "index";
    }

}
