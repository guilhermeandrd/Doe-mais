package com.example.Doe.mais.food;

import com.example.Doe.mais.usuario.Usuario;

public record UsuarioResponseDTO(Long id, String nome, String login, String email, String image) {
    public UsuarioResponseDTO(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getEmail(), usuario.getImage());
    }

}
