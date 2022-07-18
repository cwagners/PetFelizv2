package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.service.InformacoesService;
import org.springframework.stereotype.Controller;
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
    @RequestMapping("/telefones")
    public List<String> listarTelefones(){

        return informacoesService.listarTelefones();
    }

    @RequestMapping("/enderecos")
    public List<String> listarEnderecos(){

        return informacoesService.listarEnderecos();
    }

    @RequestMapping("/horarios")
    public List<String> listarHorarios(){

        return informacoesService.listarHorarios();
    }

}
