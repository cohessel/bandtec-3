package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placar")
public class PlacarController {

    private int golsTime1;
    private int golsTime2;

    @GetMapping
    public String boasVindas(){
        return "Bem vindo (a) a API de placar!";
    }

    @GetMapping("/atual")
    public String placarAtual() {
        return "Placar: Time 1 "+golsTime1+
                "   x   "+
                "Time 2 "+golsTime2;
    }

    @GetMapping ("/gol/{time}")
    public void marcarGols(@PathVariable("time") Integer time) {
        if (time == 1) {
            golsTime1++;
        }
        if (time == 2) {
            golsTime2++;
        }

    }

    @GetMapping ("/resultado")
    public String getResultado(){
            String resultado;
            if(golsTime1 > golsTime2){
                resultado = "0 time 1 venceu";
            } else if (golsTime2 > golsTime1){
                resultado = "0 time 2 venceu";
            } else {
                resultado = "EMPATE";
            }

            return resultado;

        }

}
