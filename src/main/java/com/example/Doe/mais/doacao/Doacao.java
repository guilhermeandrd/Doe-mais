package com.example.Doe.mais.doacao;

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
}
