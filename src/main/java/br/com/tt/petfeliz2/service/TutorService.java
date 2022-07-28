package br.com.tt.petfeliz2.service;

import br.com.tt.petfeliz2.controller.dto.CuidadorCriacao;
import br.com.tt.petfeliz2.controller.dto.TutorCriacao;
import br.com.tt.petfeliz2.model.Cuidador;
import br.com.tt.petfeliz2.model.TipoCuidador;
import br.com.tt.petfeliz2.model.TipoSituacao;
import br.com.tt.petfeliz2.model.Tutor;
import br.com.tt.petfeliz2.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    private TutorRepository tutorRepository;

    private static final TipoSituacao SITUACAO = TipoSituacao.ATIVO;

    public TutorService(TutorRepository tutorRepository){
        this.tutorRepository = tutorRepository;
    }

    public List<Tutor> getTutores() {
        return tutorRepository.findAll();
    }

    public Tutor criar(TutorCriacao tutorDto) {
        Tutor tutorEntity = converterParaEntity(tutorDto);
        tutorRepository.save(tutorEntity);
        return tutorEntity;
    }

    private Tutor converterParaEntity(TutorCriacao tutorDto) {

        return new Tutor(null, tutorDto.getNome(), tutorDto.getCpf(), tutorDto.getTelefone(), tutorDto.getCidade(),
                tutorDto.getEstado(), SITUACAO, null);
    }
}
