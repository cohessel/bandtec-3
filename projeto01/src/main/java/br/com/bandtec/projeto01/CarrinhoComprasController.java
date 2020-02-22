package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CarrinhoComprasController {

    @GetMapping("/carrinho/comprar/{item}/{valor}/{quantidade}")
    public String comprar(@PathVariable ("item") String item,
                           @PathVariable ("valor") Double valor,
                            @PathVariable ("quantidade") Integer quantidade){

        return "Produto adicionado no carrinho";
    }

    @GetMapping ("/carrinho")
    public String getProdutos(){
        return "teste";
    }

}
