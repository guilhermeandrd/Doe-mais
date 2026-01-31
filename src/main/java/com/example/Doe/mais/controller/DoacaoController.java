package com.example.Doe.mais.controller;

import com.example.Doe.mais.doacao.Doacao;
import com.example.Doe.mais.doacao.DoacaoRepository;
import com.example.Doe.mais.food.DoacaoRequestDTO;
import com.example.Doe.mais.food.DoacaoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doacao")
public class DoacaoController {

    @Autowired
    private DoacaoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")

    @PostMapping
    public void saveDoacao(@RequestBody DoacaoRequestDTO data){
        Doacao doacaoData = new Doacao(data);
        repository.save(doacaoData);

        return;
    }


    @GetMapping
    public List<DoacaoResponseDTO> getAll(){
        List<DoacaoResponseDTO> doacaoList = repository.findAll().stream().map(DoacaoResponseDTO::new).toList();

        return doacaoList;
    }

}
