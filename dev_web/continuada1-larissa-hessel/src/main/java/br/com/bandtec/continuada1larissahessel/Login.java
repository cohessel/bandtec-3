package br.com.bandtec.continuada1larissahessel;

import java.time.LocalDateTime;

public class Login {
    private String usuario;
    private String senha;
    private LocalDateTime autenticado;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.autenticado = autenticado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getAutenticado() {
        return autenticado;
    }

    public void setAutenticado(LocalDateTime autenticado) {
        this.autenticado = autenticado;
    }

    @Override
    public String toString() {
        return "Login{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }


}
