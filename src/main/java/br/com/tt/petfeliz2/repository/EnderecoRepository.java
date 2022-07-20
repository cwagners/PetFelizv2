package br.com.tt.petfeliz2.repository;

import br.com.tt.petfeliz2.model.Endereco;
import br.com.tt.petfeliz2.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository  extends JpaRepository<Endereco, String> {
}
