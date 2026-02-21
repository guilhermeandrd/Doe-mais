package com.example.Doe.mais.dto;

import com.example.Doe.mais.entity.Campanha;
import com.example.Doe.mais.entity.Instituicao;

public record CampanhaRequestDTO(String nome, String descricao,String status, Instituicao instituicao) {
}
