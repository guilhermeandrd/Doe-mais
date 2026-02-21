package com.example.Doe.mais.entity;

import com.example.Doe.mais.dto.CampanhaRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "campanha")
@Entity(name = "campanha")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Campanha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_instituicao")
    private Instituicao instituicao;

    public Campanha(CampanhaRequestDTO data) {
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.status = data.status();
        this.instituicao = data.instituicao();
    }

}
