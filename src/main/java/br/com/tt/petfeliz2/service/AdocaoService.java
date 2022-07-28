package br.com.tt.petfeliz2.service;

import br.com.tt.petfeliz2.model.Adocao;
import br.com.tt.petfeliz2.model.Cuidador;
import br.com.tt.petfeliz2.repository.AdocaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdocaoService {

    private AdocaoRepository adocaoRepository;

    public AdocaoService(AdocaoRepository adocaoRepository){
        this.adocaoRepository = adocaoRepository;
    }
    public List<Adocao> getAdocoes(){
        return adocaoRepository.findAll();
    }
}
