package br.com.tt.petfeliz2.controller.dto;

import br.com.tt.petfeliz2.model.Estado;

public class CuidadorCriacao {
    private String nome;
    private String cpf;
    private String telefone;
    private String cidade;
    private Estado estado;


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public Estado getEstado() {
        return estado;
    }
}
