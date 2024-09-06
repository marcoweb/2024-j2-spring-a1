package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import application.model.PessoaRepository;

import org.springframework.ui.Model;   

@Controller
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepo;

    @RequestMapping("/pessoas/list")
    public String list(Model ui) {
        ui.addAttribute("pessoas", pessoaRepo.findAll());
        return "/pessoas/list";
    }
}