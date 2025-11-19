package br.petersonaraujo.Controle.geral.de.artes.marciais.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_graduacoes")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Graduacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String graduacao;

    @ManyToMany
    @JoinTable(
            name = "tb_graduacao_movimento",
            joinColumns = @JoinColumn(name = "graduacao_id"),
            inverseJoinColumns = @JoinColumn(name = "movimento_id")
    )
    private List<Movimento> movimentos;

    @ManyToMany
    @JoinTable(
            name = "tb_graduacao_kata",
            joinColumns = @JoinColumn(name = "graduacao_id"),
            inverseJoinColumns = @JoinColumn(name = "kata_id")
    )
    private List<Kata> katas;
}
