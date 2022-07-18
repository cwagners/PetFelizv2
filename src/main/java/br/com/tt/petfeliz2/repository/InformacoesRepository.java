package br.com.tt.petfeliz2.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InformacoesRepository {

    public List<String> listarTelefones(){

        List<String> telefones = new ArrayList<>();
        telefones.add("51 98788888");
        telefones.add("51 98788833");
        telefones.add("51 98788765");
        return telefones;
    }


    public List<String> listarEnderecos(){

        List<String> enderecos = new ArrayList<>();
        enderecos.add("rua a 876");
        enderecos.add("rua c 000");
        enderecos.add("rua xyz 654");
        return enderecos;
    }

    public List<String> listarHorarios(){

        List<String> horarios = new ArrayList<>();
        horarios.add("SEG A SAB 08h as 22h");
        horarios.add("DOMINGO 14h as 20h");
        horarios.add("FERIADOS 14h as 20h");
        return horarios;
    }
}
