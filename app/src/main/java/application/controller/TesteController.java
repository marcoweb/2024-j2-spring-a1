package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;   

@Controller
public class TesteController {

    @RequestMapping("/aula")
    public String testando() {
        return "teste";
    }

    @RequestMapping("/mensagem")
    public String mensagem(@RequestParam("nome") String nome, Model ui) {
        String m = "Olá " + nome;
        ui.addAttribute("saudacao", m);
        return "mensagem";
    }
}