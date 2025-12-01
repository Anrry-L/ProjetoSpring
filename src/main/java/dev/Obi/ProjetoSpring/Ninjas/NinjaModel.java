package dev.Obi.ProjetoSpring.Ninjas;

import dev.Obi.ProjetoSpring.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key
    private MissoesModel missoes;

}