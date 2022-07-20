package br.com.tt.petfeliz2.service;



import br.com.tt.petfeliz2.model.Horario;
import br.com.tt.petfeliz2.repository.HorarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioService {

    private HorarioRepository horarioRepository;

    public HorarioService(HorarioRepository horarioRepository){
        this.horarioRepository = horarioRepository;
    }
    public List<Horario> getHorarios() {

        List<Horario> horarios = horarioRepository.findAll();
        return horarios;
    }
}
