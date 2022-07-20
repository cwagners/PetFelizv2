package br.com.tt.petfeliz2.service;

import br.com.tt.petfeliz2.model.Endereco;
import br.com.tt.petfeliz2.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    private EnderecoRepository enderecoRepository;
    public EnderecoService(EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }
    public List<Endereco> getEnderecos() {

        List<Endereco> enderecos = enderecoRepository.findAll();
        return enderecos;
    }
}
