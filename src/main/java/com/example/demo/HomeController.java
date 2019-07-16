package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/loadform")
    public String loadformpage(Model model){
        /* Adding new instance of the Employee class to the model
        * this creates an "Empty copy" of the Employee class named employee*/
        model.addAttribute("employee", new Employee());
        /* the value stored on the employee object can
        be accessed by the formpage template
        when the user submits the information to the form, its kept within the model
        , and can be drawn down into the loadform method using the @ModelAttribute annotation
        */
        return "formpage";
    }
    @PostMapping("/loadconfirm")
    public String loadconfirm(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee1", employee);
        return "confirm";
    }
}
