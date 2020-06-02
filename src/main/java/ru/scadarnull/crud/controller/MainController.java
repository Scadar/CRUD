package ru.scadarnull.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.scadarnull.crud.entity.Person;
import ru.scadarnull.crud.service.PersonService;

import javax.annotation.PostConstruct;

@Controller
public class MainController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("persons", personService.findAll());
        return "main";
    }

    @GetMapping("/add")
    public String showPerson(Model model){
        model.addAttribute("person", new Person());
        return "add";
    }

    @PostMapping("/add")
    public String addPerson(@ModelAttribute Person person){
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/edit/{person}")
    public String showEditPerson(@PathVariable Person person, Model model){
        model.addAttribute("person", person);
        return "edit";
    }

}
