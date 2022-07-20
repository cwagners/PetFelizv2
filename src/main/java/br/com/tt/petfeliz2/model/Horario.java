package br.com.tt.petfeliz2.model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "tb_horarios")
public class Horario {
    Horario(){}
    public Horario(Long id, String horario) {
        this.id = id;
        this.horario = horario;
    }
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "horario")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String horario;

    public Long getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }
}
