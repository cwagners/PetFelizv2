package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.service.InformacoesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InformacoesController {

    private InformacoesService informacoesService;
    public InformacoesController(InformacoesService informacoesService){
        this.informacoesService = informacoesService;
    }
    @GetMapping("/telefones")
    public List<String> listarTelefones(){

        return informacoesService.listarTelefones();
    }

    @GetMapping("/enderecos")
    public List<String> listarEnderecos(){

        return informacoesService.listarEnderecos();
    }

    @GetMapping("/horarios")
    public List<String> listarHorarios(){

        return informacoesService.listarHorarios();
    }

}
