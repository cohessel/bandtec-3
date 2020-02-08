package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String inicio(){
        return "minha primeira API REST oooowwwwn!";
    }


    @GetMapping ("/cumprimentar")
    public String cumprimentar(){
        return "Boa noite, galera!";
    }

    @GetMapping ("/cumprimentar/teamo")
    public String teamo(){
        return "MOMOMOMOMO";
    }

    @GetMapping("/beijar/{quem}") // ex: /beijar/GodZilla
    public String beijar(@PathVariable("quem") String quem) {
        return "Um beijo, "+quem+"!";
    }

    @GetMapping("/deletar/{usuario}")
    public String usuario(@PathVariable("usuario") String usuario){
        return usuario+ " deletado(a)";
    }

    @GetMapping("/dados/{altura}/{nome}")
    public String dados(@PathVariable("altura") String altura,
                           @PathVariable("nome") String nome){
        return "Olá, "+nome+ " você tem "+altura+ " de altura!";
    }

    @GetMapping("escola/{nota1}/{nota2}/{nomeAluno}")
    public String escola(@PathVariable("nota1")Double nota1,
                         @PathVariable("nota2") Double nota2,
                         @PathVariable("nomeAluno")String nome){
        Double media = (nota1 + nota2) / 2;
        String resultado = media >= 5 ? "aprovado" : "reprovado";
        return "Oi,"+nome+" sua média foi "+media+" e seu" +
                " resultado foi "+resultado;
    }
}