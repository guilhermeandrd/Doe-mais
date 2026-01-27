package com.example.Doe.mais.food;

import com.example.Doe.mais.doacao.Doacao;

public record DoacaoResponseDTO(Long id, String title, String descricao, String image) {
    public DoacaoResponseDTO(Doacao doacao){
        this(doacao.getId(), doacao.getTitle(), doacao.getDescricao(), doacao.getImage());
    }

}
