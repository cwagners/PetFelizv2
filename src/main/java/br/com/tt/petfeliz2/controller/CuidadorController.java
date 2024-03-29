package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.controller.dto.CuidadorCriacao;
import br.com.tt.petfeliz2.model.Cuidador;
import br.com.tt.petfeliz2.service.CuidadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
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

    @PostMapping("/api/cuidador")
    public ResponseEntity criar(@RequestBody CuidadorCriacao cuidadorDto){

        Cuidador cuidador = cuidadorService.criar(cuidadorDto);
        Long id = cuidador.getId();
        return ResponseEntity.created(URI.create("/api/cuidador/"+id)).build();
    }
}
