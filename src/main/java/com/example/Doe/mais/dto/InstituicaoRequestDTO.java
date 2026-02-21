package com.example.Doe.mais.dto;

import com.example.Doe.mais.entity.Campanha;

import java.util.List;

public record InstituicaoRequestDTO(String nome, String login, String senha, String email, String imagem, String descricao, int telefone, String endereco, List<Campanha> campanhas) {
}
