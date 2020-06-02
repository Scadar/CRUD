package ru.scadarnull.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.scadarnull.crud.service.PersonService;

@Controller
public class MainController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String main(Model model){
        model.addAttribute("persons", personService.findAll());
        return "main";
    }

}
