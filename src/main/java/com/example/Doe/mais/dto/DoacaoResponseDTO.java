package com.example.Doe.mais.dto;

import com.example.Doe.mais.entity.Doacao;

public record DoacaoResponseDTO(Long id, String title, String descricao, String image) {
    public DoacaoResponseDTO(Doacao doacao){
        this(doacao.getId(), doacao.getTitle(), doacao.getDescricao(), doacao.getImage());
    }

}
