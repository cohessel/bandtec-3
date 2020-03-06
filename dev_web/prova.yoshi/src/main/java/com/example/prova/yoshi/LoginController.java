package com.example.prova.yoshi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/seguranca")
public class LoginController {

    Login credencial = new Login("Larissa","1234");
    Login autenticacao = new LoginValidacao("Larissa","")

    @PostMapping("/entrar/{login}/{senha}")
    public String entrarUsuario(
            @PathVariable("login") String login,
            @PathVariable("senha") String senha) {

        if (credencial.getUsuario().equals(login) && credencial.getSenha().equals(senha)) {
            return "Usuário autentificado";
        } else {
            return "Usuário inválido";
        }

    }

    @GetMapping ("/seguranca/usuario/logoff")
    public String altenticarUsuario{
        return
    }
}

