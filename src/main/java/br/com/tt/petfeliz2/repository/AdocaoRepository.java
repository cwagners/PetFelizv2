package br.com.tt.petfeliz2.repository;

import br.com.tt.petfeliz2.model.Adocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdocaoRepository  extends JpaRepository<Adocao, Long> {
}
