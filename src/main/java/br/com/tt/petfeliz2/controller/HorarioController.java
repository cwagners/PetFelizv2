package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.model.Horario;
import br.com.tt.petfeliz2.service.HorarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HorarioController{

    private HorarioService horarioService;

    public HorarioController(HorarioService horarioService){

        this.horarioService = horarioService;

    }
    @GetMapping("/api/horarios")
    public List<Horario> getHorarios(){
        return horarioService.getHorarios();
    }
}
