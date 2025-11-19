package br.petersonaraujo.Controle.geral.de.artes.marciais.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_katas")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Kata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private Integer quantidade_movimentos;

}
