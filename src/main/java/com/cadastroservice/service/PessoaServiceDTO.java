package com.cadastroservice.service;

import com.cadastroservice.model.PessoaDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpHeaders;

import java.util.List;
import java.util.Arrays;

@Service
public class PessoaServiceDTO {
    public List<PessoaDTO> obterTodos() {
        RestTemplate restTemplate = new RestTemplate();
        String urlBase = "http://localhost:8080/cadastramento";

        HttpHeaders header = new HttpHeaders();
        header.add("ContentType", "Appication/json");

        HttpEntity httpEntity = new HttpEntity(header);

        ResponseEntity<PessoaDTO[]> pessoas = restTemplate.exchange(urlBase, HttpMethod.GET, httpEntity,PessoaDTO[].class);

        return Arrays.asList(pessoas.getBody());
    }

}
