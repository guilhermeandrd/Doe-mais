package com.example.Doe.mais.instituicao;

import com.example.Doe.mais.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "instituicao")
@Entity(name = "instituicao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Instituicao extends Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private int telefone;
    private String endereco;

    
}
