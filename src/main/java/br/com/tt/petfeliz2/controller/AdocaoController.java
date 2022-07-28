package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.model.Adocao;
import br.com.tt.petfeliz2.service.AdocaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdocaoController {

    private AdocaoService adocaoService;

    public AdocaoController(AdocaoService adocaoService) {

        this.adocaoService = adocaoService;
    }

    @GetMapping("/api/adocoes")
    public List<Adocao> getAdocoes() {

        return adocaoService.getAdocoes();

    }
}


