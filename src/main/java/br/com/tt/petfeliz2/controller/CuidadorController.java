package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.model.Cuidador;
import br.com.tt.petfeliz2.service.CuidadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CuidadorController {

    private CuidadorService cuidadorService;

    public CuidadorController(CuidadorService cuidadorService){
        this.cuidadorService = cuidadorService;
    }

    @GetMapping("/api/cuidadores")
    public List<Cuidador> getCuidadores(){
        return cuidadorService.getCuidadores();
    }
}