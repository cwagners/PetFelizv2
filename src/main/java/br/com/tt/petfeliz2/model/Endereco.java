package br.com.tt.petfeliz2.model;

import javax.persistence.*;

@Entity
@Table(name="tb_enderecos")
public class Endereco {

    Endereco() {} // Construtor com visibilidade "default" para o Hibernate conseguir usar essa entidade

    public Endereco(Long id, String endereco) {
        this.id = id;
        this.endereco = endereco;
    }
    @Id
    @Column(name ="id")
    private Long id;

    @Column(name ="endereco")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String endereco;

    public Long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }
}
