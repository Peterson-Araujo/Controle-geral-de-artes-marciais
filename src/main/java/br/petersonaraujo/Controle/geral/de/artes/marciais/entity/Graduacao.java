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

    @ManyToMany // Definição do tipo de relacionamento entre a tabela Movimento e Graduação
    @JoinTable( // As anotações @JoinTable são usadas para mapear uma relação ManyToMany entre duas entidades
            name = "tb_graduacao_movimento", // Nome da tabela intermediária que será criada para relação
            joinColumns = @JoinColumn(name = "graduacao_id"), // O parâmetro joinColumns é usado para definir a coluna que faz referência à entidade Graduacao na tabela intermediária.
            inverseJoinColumns = @JoinColumn(name = "movimento_id") // O parâmetro inverseJoinColumns é usado para definir a coluna que faz referência à entidade Movimento
    )
    private List<Movimento> movimentos;

    @ManyToMany // Definição do tipo de relacionamento entre a tabela Kata e Graduação
    @JoinTable( // As anotações @JoinTable são usadas para mapear uma relação ManyToMany entre duas entidades
            name = "tb_graduacao_kata", // Nome da tabela intermediária que será criada para relação
            joinColumns = @JoinColumn(name = "graduacao_id"), // O parâmetro joinColumns é usado para definir a coluna que faz referência à entidade Graduacao na tabela intermediária.
            inverseJoinColumns = @JoinColumn(name = "kata_id") // O parâmetro inverseJoinColumns é usado para definir a coluna que faz referência à entidade Katas
    )
    private List<Kata> katas;
}
