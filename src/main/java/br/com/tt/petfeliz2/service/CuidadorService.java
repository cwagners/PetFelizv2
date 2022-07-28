package br.com.tt.petfeliz2.service;

import br.com.tt.petfeliz2.controller.dto.CuidadorCriacao;
import br.com.tt.petfeliz2.model.Cuidador;
import br.com.tt.petfeliz2.model.TipoCuidador;
import br.com.tt.petfeliz2.repository.CuidadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuidadorService {

    private CuidadorRepository cuidadorRepository;

    private static final TipoCuidador NIVEL_INICIAL_CUIDADOR = TipoCuidador.INICIANTE;

    public CuidadorService(CuidadorRepository cuidadorRepository){
        this.cuidadorRepository = cuidadorRepository;
    }

    public List<Cuidador> getCuidadores(){
        return cuidadorRepository.findAll();
    }

    public Cuidador criar(CuidadorCriacao cuidadorDto) {
        Cuidador cuidadorEntity = converterParaEntity(cuidadorDto);
        cuidadorRepository.save(cuidadorEntity);
        return cuidadorEntity;
    }

    private Cuidador converterParaEntity(CuidadorCriacao cuidadorDto) {

        return new Cuidador(null, cuidadorDto.getNome(), cuidadorDto.getCpf(), cuidadorDto.getTelefone(),
                cuidadorDto.getCidade(), cuidadorDto.getEstado(),NIVEL_INICIAL_CUIDADOR, null);
    }
}
