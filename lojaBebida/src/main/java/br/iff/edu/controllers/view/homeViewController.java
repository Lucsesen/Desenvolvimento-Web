package br.iff.edu.controllers.view;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")

public class homeViewController {

    @GetMapping(path="/")
    public String home(){
        return "layoutBase";
    }
}
