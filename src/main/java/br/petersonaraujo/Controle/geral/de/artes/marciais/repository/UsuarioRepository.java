package br.petersonaraujo.Controle.geral.de.artes.marciais.repository;

import br.petersonaraujo.Controle.geral.de.artes.marciais.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
