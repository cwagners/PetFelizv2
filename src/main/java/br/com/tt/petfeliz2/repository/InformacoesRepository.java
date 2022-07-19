package br.com.tt.petfeliz2.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InformacoesRepository {

    private JdbcTemplate jdbcTemplate;
    public InformacoesRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<String> listarTelefones(){

         List<String> telefones = jdbcTemplate.queryForList("select numero from tb_telefones", String.class);
        return telefones;
    }


    public List<String> listarEnderecos(){

        List<String> enderecos = jdbcTemplate.queryForList("select endereco from tb_enderecos", String.class);
        return enderecos;
    }

    public List<String> listarHorarios(){

        List<String> horarios = jdbcTemplate.queryForList("select horario from tb_horarios", String.class);
        return horarios;
    }

    public void cadastrarTelefone(String numero){
        jdbcTemplate.update("INSERT INTO tb_telefones (numero) VALUES (?)",numero);
    }

    public void cadastrarEndereco(String logradouro){
        jdbcTemplate.update("INSERT INTO tb_enderecos (endereco) VALUES (?)", logradouro);
    }

    public void cadastrarHorario(String hora) {
        jdbcTemplate.update("INSERT INTO tb_horarios (horario) VALUES (?)", hora);
    }
}
