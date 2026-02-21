package com.example.Doe.mais.controller;


import com.example.Doe.mais.entity.Campanha;
import com.example.Doe.mais.repository.CampanhaRepository;
import com.example.Doe.mais.dto.CampanhaRequestDTO;
import com.example.Doe.mais.dto.CampanhaResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("campanha")
public class CampanhaController {
    @Autowired
    private CampanhaRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")

    @PostMapping
    public void saveCampanha(@RequestBody CampanhaRequestDTO data){
        Campanha campanhaData = new Campanha(data);
        repository.save(campanhaData);
    }


    @GetMapping
    public List<CampanhaResponseDTO> getAll(){
        List<CampanhaResponseDTO> campanhaList = repository.findAll().stream().map(CampanhaResponseDTO::new).toList();

        return campanhaList;
    }

}
