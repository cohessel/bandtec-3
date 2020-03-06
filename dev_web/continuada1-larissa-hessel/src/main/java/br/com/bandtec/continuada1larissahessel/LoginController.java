package br.com.bandtec.continuada1larissahessel;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/seguranca")
public class LoginController {

    Login credencial = new Login("hessel", "9090");

    @GetMapping("/entrar")
    public Login getCredencial() {
        return credencial;
    }

    @PostMapping("/entrar/{login}/{senha}")
    public String entrarUsuario(
            @PathVariable("login") String login,
            @PathVariable("senha") String senha) {

        if(getCredencial().equals(credencial)){
            return "Já existe usuário autenticado";
        }

        if (credencial.getUsuario().equals(login) && credencial.getSenha().equals(senha)) {

            return "Usuário autentificado";
        } else {
            return "Falha na autenticação";
        }
    }

    @GetMapping("/usuario")
    private String altenticarUsuario(){


        public String toString(){
            return "Login{" +
                    "usuario='" + usuario + '\'' +
                    ", autenticado='" + LocalDateTime.now() + '\'' +
                    '}';
        }
    }

    @DeleteMapping ("/logoff")
    private String deletarUsuario(){

    }

}

