package com.dio.santander.bankline.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.dio.santander.bankline.api.controller.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
    
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;
        
    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();

    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista) {
        service.save(correntista);
    }

    }

