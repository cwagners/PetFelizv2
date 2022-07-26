package br.com.tt.petfeliz2.service;

import br.com.tt.petfeliz2.model.Cuidador;
import br.com.tt.petfeliz2.repository.CuidadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuidadorService {

    private CuidadorRepository cuidadorRepository;

    public CuidadorService(CuidadorRepository cuidadorRepository){
        this.cuidadorRepository = cuidadorRepository;
    }

    public List<Cuidador> getCuidadores(){
        return cuidadorRepository.findAll();
    }
}
