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

    @DeleteMapping ("/excluir")
    public String deleteSalas(){
        salasList.clear();
        return "Sala deletada";
    }

    @DeleteMapping ("/excluir/{posicao}")
    public String deletarSalaPosicao(
            @PathVariable ("posicao") Integer posicao){
        salasList.remove(posicao);
        return "Posição da sala deletada";
    }

    @PutMapping ("/atualizar/{posicao}/{nome}/{capacidade}")
    public String atualizarCapacidade(
            @PathVariable("posicao") int posicao,
            @PathVariable("nome") String nome,
            @PathVariable("capacidade") int capacidade
    ) {
        Sala alvo = salasList.get(posicao);
        alvo.setNome(nome);
        alvo.setCapacidade(capacidade);
        return "Capacidade atualizada!";
    }


}
