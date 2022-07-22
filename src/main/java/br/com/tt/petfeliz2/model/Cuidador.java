package br.com.tt.petfeliz2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cuidadores")
public class Cuidador{

    public Cuidador(){}

    public Cuidador(Long id, String nome, String cidade, String raca) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.raca = raca;
    }

    @Id
    @Column(name = "id")
    private Long id;

    @Column
    private String nome;

    @Column
    private String cidade;

    @Column
    private String raca;
}
