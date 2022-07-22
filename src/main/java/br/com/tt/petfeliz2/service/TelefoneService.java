package br.com.tt.petfeliz2.service;

import br.com.tt.petfeliz2.model.Telefone;
import br.com.tt.petfeliz2.repository.TelefoneRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TelefoneService {

    private TelefoneRepository telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository){
        this.telefoneRepository = telefoneRepository;
    }
    public List<Telefone> getTelefones() {

        List<Telefone> telefones = telefoneRepository.findAll();

        return telefones;
    }

    public void criarTelefone(@RequestBody Telefone telefone) {

        telefoneRepository.save(telefone);
    }
}
