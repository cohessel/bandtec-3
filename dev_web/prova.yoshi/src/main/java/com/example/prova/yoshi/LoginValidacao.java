package com.example.prova.yoshi;

import java.time.LocalDateTime;

public class LoginValidacao {
    private String usuario;
    private LocalDateTime autenticado;

    public LoginValidacao(String usuario, LocalDateTime autenticado) {
        this.usuario = usuario;
        this.autenticado = autenticado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getAutenticado() {
        return autenticado;
    }

    public void setAutenticado(LocalDateTime autenticado) {
        this.autenticado = autenticado;
    }

    @Override
    public String toString() {
        return "LoginValidacao{" +
                "usuario='" + usuario + '\'' +
                ", autenticado=" + autenticado +
                '}';
    }
}
