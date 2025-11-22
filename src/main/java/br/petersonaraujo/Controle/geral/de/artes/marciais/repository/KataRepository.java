package br.petersonaraujo.Controle.geral.de.artes.marciais.repository;

import br.petersonaraujo.Controle.geral.de.artes.marciais.entity.Kata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KataRepository extends JpaRepository<Kata, Long> {
}
