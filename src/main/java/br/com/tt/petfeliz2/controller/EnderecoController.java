package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.model.Endereco;
import br.com.tt.petfeliz2.service.EnderecoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnderecoController {

    private EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService){

        this.enderecoService = enderecoService;

    }

    @GetMapping("/api/enderecos")
    public List<Endereco> getEnderecos(){
        return enderecoService.getEnderecos();
    }

    @PostMapping("/api/enderecos")
    public void criarEndereco(@RequestBody Endereco endereco){
        enderecoService.criarEndereco(endereco);
    }
}


