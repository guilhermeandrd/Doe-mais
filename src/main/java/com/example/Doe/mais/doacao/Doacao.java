package com.example.Doe.mais.doacao;

import com.example.Doe.mais.food.DoacaoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doacao")
@Entity(name = "doacao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Doacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String descricao;
    private String image;

    public Doacao(DoacaoRequestDTO data){
        this.title = data.title();
        this.descricao = data.descricao();
        this.image = data.image();
    }

}
