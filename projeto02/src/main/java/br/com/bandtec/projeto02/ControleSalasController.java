package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/controle-salas")
public class ControleSalasController {

    List<Sala> salasList = new ArrayList<>();

    @PostMapping ("/criar/{nome}/{capacidade}")
    public String criarListasSalas (
            @PathVariable("nome") String nome,
            @PathVariable("capacidade")Integer capacidade){
        salasList.add(new Sala(nome, capacidade));
        return "Adicionado com sucesso";
    }

    @GetMapping
    public List<Sala> exibirListasSalas (){
        return salasList;
    }
}
