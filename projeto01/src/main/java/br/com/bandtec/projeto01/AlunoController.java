package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private List<Aluno> lista =
            Arrays.asList(
                    new Aluno(1,"Josh",100.0),
                    new Aluno (2, "Maria",120.0),
                    new Aluno(3,"João",80.0)
                );
    @GetMapping
    public List<Aluno> getLista() {
        return lista;
    }

    @GetMapping("/contagem")
    public Integer getContagem() {
        return lista.size();
    }

    @GetMapping("/excluir/{indice}")
    public void excluir(@PathVariable("indice")Integer indice){
        lista.remove(indice);
        
    }
}
