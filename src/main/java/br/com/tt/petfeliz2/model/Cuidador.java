package br.com.tt.petfeliz2.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_cuidador")
public class Cuidador{

    public Cuidador() {
    }

    public Cuidador(Long id, String nome, String cpf, String telefone, String cidade, Estado estado, TipoCuidador nivel, List<Raca> racasQuecCuida) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.nivel = nivel;
        this.racasQueCuida = racasQuecCuida;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name= "cpf")
    private String cpf;

    @Column(name= "telefone")
    private String telefone;

    @Column(name= "cidade")
    private String cidade;

    @Column(name="estado")
    private Estado estado;

    @Column(name= "nivel")
    private TipoCuidador nivel;

    @OneToMany(mappedBy = "cuidador", cascade = {CascadeType.ALL})
    private List<Raca> racasQueCuida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoCuidador getNivel() {
        return nivel;
    }

    public void setNivel(TipoCuidador nivel) {
        this.nivel = nivel;
    }

    public List<Raca> getRacasQueCuida() {
        return racasQueCuida;
    }

    public void setRacasQueCuida(List<Raca> racasQueCuida) {
        this.racasQueCuida = racasQueCuida;
    }

    public void adicionarRaca(Raca novaRaca){
        racasQueCuida.add(novaRaca);
    }
}
