package com.example.Doe.mais.controller;

import com.example.Doe.mais.doacao.DoacaoRepository;
import com.example.Doe.mais.food.UsuarioRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    private DoacaoRepository repository;

    @PostMapping
    public void saveUsuario(@RequestBody UsuarioRequestDTO data){
    }


    @GetMapping
}
