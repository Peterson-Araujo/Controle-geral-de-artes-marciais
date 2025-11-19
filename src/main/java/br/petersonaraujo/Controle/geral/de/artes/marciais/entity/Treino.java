package br.petersonaraujo.Controle.geral.de.artes.marciais.entity;

import br.petersonaraujo.Controle.geral.de.artes.marciais.entity.enums.DiaDaSemana;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_treinos")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DiaDaSemana dia_da_semana;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Usuario professor;

    private String observacoes;

}
