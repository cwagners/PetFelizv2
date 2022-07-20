package br.com.tt.petfeliz2.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="tb_telefones")
public class Telefone {

    Telefone() {} // Construtor com visibilidade "default" para o Hibernate conseguir usar essa entidade

    public Telefone(Long id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    @Id
    @Column(name ="id")
    private Long id;

    @Column(name ="numero")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String numero;

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }
}
