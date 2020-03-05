package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sala")
public class SalaController {
    //REGINO.delete

    private Sala salaAtual;

    @GetMapping
    public Sala getSalaAtual() {
        return salaAtual;
    }

    @PostMapping("/cadastrar/{nome}/{capacidade}")
    public void cadastrarSala(
            @PathVariable("nome") String nome,
            @PathVariable("capacidade") Integer capacidade
    ) {
        if(salaAtual == null)
            salaAtual = new Sala(nome, capacidade);
    }

//    @RequestMapping(
//            value = "/excluir",
//            method = RequestMethod.DELETE)
    @DeleteMapping ("excluir")
    public void excluirSala() {
        salaAtual = null;
    }

    @PutMapping("/alterar/{nome}/{capacidade}")
    private String atualizarSala(
            @PathVariable("nome") String nome,
            @PathVariable("capacidade") Integer capacidade){

//        if(salaAtual != null)
//            salaAtual = new Sala(nome, capacidade);
//        return "Atualizado!";

        salaAtual.setNome(nome);
        salaAtual.setCapacidade(capacidade);
        return "Atualizado!";
    }

}