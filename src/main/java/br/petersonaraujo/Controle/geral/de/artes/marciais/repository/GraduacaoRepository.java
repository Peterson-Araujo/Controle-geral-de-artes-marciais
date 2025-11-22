package br.petersonaraujo.Controle.geral.de.artes.marciais.repository;

import br.petersonaraujo.Controle.geral.de.artes.marciais.entity.Graduacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduacaoRepository extends JpaRepository<Graduacao, Long> {
}
