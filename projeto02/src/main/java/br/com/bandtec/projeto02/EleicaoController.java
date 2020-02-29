package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/eleicao")
public class EleicaoController {
    List<Eleicao> eleicaoList = new ArrayList<>();

    Eleicao eleicao = new Eleicao();


    @GetMapping("/resultado")
        public Eleicao getResultado(){
            return eleicao;

    }

    @PostMapping("/registra-eleitor/{idade}")
    public String registrarEleitor (
            @PathVariable ("idade") int idade){
            if(idade >= 16){
                return "Eleitor pode votar";
            }else{
                return "Eleitor não tem idade mínima para votar";
            }
    }

//    @PostMapping("/votar/{candidato}")
//    public String votarCandidato (
//            @PathVariable("candidato") int candidato){
//        if(candidato == 1){
//            eleicaoList.add()
//        }
//    }
//    )
}
