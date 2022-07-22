package br.com.tt.petfeliz2.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="tb_telefones")
public class Telefone {

    Telefone() {} // Construtor com visibilidade "default" para o Hibernate conseguir usar essa entidade

    public Telefone(Long id, String numero, String ddd) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
    }

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ddd")
    private String ddd;

    @Column(name ="numero")
    private String numero;

    public Long getId() {
        return id;
    }

    public String getDdd(){
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
