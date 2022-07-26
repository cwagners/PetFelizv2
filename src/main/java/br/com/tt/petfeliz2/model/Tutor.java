package br.com.tt.petfeliz2.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_tutor")
public class Tutor {
    Tutor(){}

    public Tutor(Long id, String nome, String telefone, String cidade, Estado estado, TipoSituacao situacao, List<Adocao> adocoes) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.situacao = situacao;
        this.adocoes = adocoes;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private Estado estado;

    @Column(name = "situacao")
    @Enumerated(value = EnumType.STRING)
    private TipoSituacao situacao;

    @OneToMany(mappedBy = "tutor", cascade = {CascadeType.ALL})
    private List<Adocao> adocoes;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
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

    public TipoSituacao getSituacao() {
        return situacao;
    }

    public List<Adocao> getAdocoes() {
        return adocoes;
    }

    public void adicionarAdocao(Adocao novaAdocao) {
        adocoes.add(novaAdocao);
    }
}
