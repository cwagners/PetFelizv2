package br.com.tt.petfeliz2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "tb_animais")
public class Animal {
    public Animal() {
    }

    public Animal(Long id, Integer idade, Float peso, String raca) {
        this.id = id;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    @Id
    @Column
    private Long id;

    @Column
    private Integer idade;

    @Column
    private Float peso;

    @Column
    private String raca;

}
