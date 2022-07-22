package br.com.tt.petfeliz2.model;

import javax.persistence.*;

@Entity
@Table(name="tb_enderecos")
public class Endereco {

    Endereco() {} // Construtor com visibilidade "default" para o Hibernate conseguir usar essa entidade
    public Endereco(Long id, String logradouro, Integer numero) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="logradouro")
    private String logradouro;

    @Column(name = "numero")
    private Integer numero;

    public Long getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero(){
        return numero;
    }
}
