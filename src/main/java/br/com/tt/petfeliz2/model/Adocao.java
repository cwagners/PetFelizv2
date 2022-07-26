package br.com.tt.petfeliz2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="tb_adocao")
public class Adocao {

    Adocao(){}

    public Adocao(Long id, LocalDate dataAdocao, Tutor tutor) {
        this.id = id;
        this.dataAdocao = dataAdocao;
        this.tutor = tutor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dataAdocao")
    private LocalDate dataAdocao;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;

    public Long getId() {
        return id;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
