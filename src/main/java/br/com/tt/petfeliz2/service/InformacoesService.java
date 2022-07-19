package br.com.tt.petfeliz2.service;

import br.com.tt.petfeliz2.repository.InformacoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InformacoesService {
    private InformacoesRepository informacoesRepository;
    public InformacoesService(InformacoesRepository informacoesRepository) {
        this.informacoesRepository = informacoesRepository;
    }

    public List<String> listarTelefones(){

        return informacoesRepository.listarTelefones();
    }

    public List<String> listarEnderecos(){

        return informacoesRepository.listarEnderecos();
    }

    public List<String> listarHorarios(){

        return informacoesRepository.listarHorarios();
    }


    public void cadastrarTelefone(String numero) {
        informacoesRepository.cadastrarTelefone(numero);
    }

    public void cadastrarEndereco(String logradouro) {
        informacoesRepository.cadastrarEndereco(logradouro);
    }

    public void cadastrarHorario(String hora) {
        informacoesRepository.cadastrarHorario(hora);
    }
}
