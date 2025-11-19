package br.petersonaraujo.Controle.geral.de.artes.marciais.entity;

import br.petersonaraujo.Controle.geral.de.artes.marciais.entity.enums.Perfil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_usuarios")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private String email;

    private String senha;

    private LocalDate data_nascimento;

    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    @ManyToOne
    private Graduacao graduacao;
}
