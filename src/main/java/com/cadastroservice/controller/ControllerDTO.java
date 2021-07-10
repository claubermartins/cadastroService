package com.cadastroservice.controller;

import com.cadastroservice.model.PessoaDTO;
import com.cadastroservice.service.PessoaServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cadastroService")
public class ControllerDTO {
    public PessoaServiceDTO pessoaServiceDTO;

    @Autowired
    public ControllerDTO(PessoaServiceDTO pessoaServiceDTO){
        this.pessoaServiceDTO = pessoaServiceDTO;
    }
    @GetMapping
    ResponseEntity<List<PessoaDTO>> obterTodos(){
        List<PessoaDTO> pessoas = pessoaServiceDTO.obterTodos();
        return ResponseEntity.ok(pessoas);
    }
}
