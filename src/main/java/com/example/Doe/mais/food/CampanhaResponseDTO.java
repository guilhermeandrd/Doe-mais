package com.example.Doe.mais.food;

import com.example.Doe.mais.campanha.Campanha;

public record CampanhaResponseDTO(Long id, String nome, String descricao, Long id_instituicao, String status) {
    public CampanhaResponseDTO(Campanha campanha) {
        this(campanha.getId(), campanha.getNome(), campanha.getDescricao(), campanha.getId_instituicao(), campanha.getStatus());
    }
}
