package com.example.Doe.mais.dto;

import com.example.Doe.mais.entity.Campanha;
import com.example.Doe.mais.entity.Instituicao;

public record CampanhaResponseDTO(Long id, String nome, String descricao, String status, Instituicao instituicao) {
    public CampanhaResponseDTO(Campanha campanha) {
        this(campanha.getId(), campanha.getNome(), campanha.getDescricao(), campanha.getStatus(), campanha.getInstituicao());
    }
}
