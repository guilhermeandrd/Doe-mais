package com.example.Doe.mais.dto;

import com.example.Doe.mais.entity.Campanha;
import com.example.Doe.mais.entity.Instituicao;

import java.util.List;

public record InstituicaoResponseDTO(Long id, String nome, String login, String senha, String email, String imagem, String descricao, int telefone, String endereco, List<Campanha> campanhas) {
    public InstituicaoResponseDTO(Instituicao instituicao){
        this(instituicao.getId(), instituicao.getNome(), instituicao.getLogin(), instituicao.getSenha(), instituicao.getEmail(), instituicao.getImagem(), instituicao.getDescricao(), instituicao.getTelefone(), instituicao.getEndereco(), instituicao.getCampanhas());
    }

}
