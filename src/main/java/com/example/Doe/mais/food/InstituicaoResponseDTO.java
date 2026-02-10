package com.example.Doe.mais.food;

import com.example.Doe.mais.instituicao.Instituicao;

public record InstituicaoResponseDTO(Long id, String nome, String login, String senha, String email, String imagem, String descricao, int telefone, String endereco) {
    public InstituicaoResponseDTO(Instituicao instituicao){
        this(instituicao.getId(), instituicao.getNome(), instituicao.getLogin(), instituicao.getSenha(), instituicao.getEmail(), instituicao.getImagem(), instituicao.getDescricao(), instituicao.getTelefone(), instituicao.getEndereco());
    }

}
