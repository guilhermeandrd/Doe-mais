package com.example.Doe.mais.campanha;

import com.example.Doe.mais.food.CampanhaRequestDTO;
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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Long id_instituicao;
    private String status;

    public Campanha(CampanhaRequestDTO data){
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.id_instituicao = data.id_instituicao();
        this.status = data.status();
    }

}
