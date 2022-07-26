package br.com.tt.petfeliz2.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_raca")
public class Raca {

    public Raca() {
    }

    public Raca(Long id, String descricao, TipoAnimal tipo, Cuidador cuidador) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.cuidador = cuidador;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "tipo")
    @Enumerated(value = EnumType.STRING)
    private TipoAnimal tipo;

    @ManyToOne
    @JoinColumn(name = "cuidador_id")
    private Cuidador cuidador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }
}
