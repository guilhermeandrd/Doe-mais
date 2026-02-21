package com.example.Doe.mais.entity;

import com.example.Doe.mais.dto.InstituicaoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "instituicao")
@Entity(name = "instituicao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Instituicao extends Usuario {
    private String descricao;
    private int telefone;
    private String endereco;

    @OneToMany(mappedBy = "instituicao")
    private List<Campanha> campanhas;

    public Instituicao(InstituicaoRequestDTO data){
        this.setNome(data.nome());
        this.setLogin(data.login());
        this.setSenha(data.senha());
        this.setEmail(data.email());
        this.setImagem(data.imagem());
        this.descricao = data.descricao();
        this.telefone = data.telefone();
        this.endereco = data.endereco();
        this.campanhas = data.campanhas();
    }

}
