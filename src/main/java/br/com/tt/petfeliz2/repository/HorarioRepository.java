package br.com.tt.petfeliz2.repository;

import br.com.tt.petfeliz2.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository  extends JpaRepository<Horario, String> {
}
