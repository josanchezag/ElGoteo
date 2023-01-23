package com.elgotero.elgotero.controller;


import com.elgotero.elgotero.model.Client;
import com.elgotero.elgotero.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Clients")
public class ClientRestController {
    @Autowired
    ClientRepository repo;


    @GetMapping
    public List<Client> getAll() {
        return repo.findAll();
    }
}
