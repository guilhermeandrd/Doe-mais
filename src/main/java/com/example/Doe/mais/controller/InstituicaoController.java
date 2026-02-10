package com.example.Doe.mais.controller;

import com.example.Doe.mais.food.InstituicaoRequestDTO;
import com.example.Doe.mais.food.InstituicaoResponseDTO;
import com.example.Doe.mais.instituicao.Instituicao;
import com.example.Doe.mais.instituicao.InstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("instituicao")
public class InstituicaoController {

    @Autowired
    private InstituicaoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")

    @PostMapping
    public void saveInstituicao(@RequestBody InstituicaoRequestDTO data){
        Instituicao instituicaoData = new Instituicao(data);
        repository.save(instituicaoData);
    }


    @GetMapping
    public List<InstituicaoResponseDTO> getAll(){
        List<InstituicaoResponseDTO> instituicaoList = repository.findAll().stream().map(InstituicaoResponseDTO::new).toList();

        return instituicaoList;
    }

}
