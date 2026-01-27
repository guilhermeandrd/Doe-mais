package com.example.Doe.mais.controller;

import com.example.Doe.mais.doacao.Doacao;
import com.example.Doe.mais.doacao.DoacaoRepository;
import com.example.Doe.mais.food.DoacaoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("doacao")
public class DoacaoController {

    @Autowired
    private DoacaoRepository repository;

    @GetMapping
    public List<DoacaoResponseDTO> getAll(){
        List<DoacaoResponseDTO> doacaoList = repository.findAll().stream().map(DoacaoResponseDTO::new).toList();

        return doacaoList;
    }

}
