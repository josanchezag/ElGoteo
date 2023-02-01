package com.elgotero.elgotero.controller;


import com.elgotero.elgotero.model.Client;
import com.elgotero.elgotero.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Clients")
public class ClientRestController {
    @Autowired
    IClientRepository repo;

    @GetMapping
    public List<Client> getAll() {
        return repo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client insertClient(@RequestBody Client p) {
        return repo.save(p);
    }

    @PutMapping
    public Client modifyClient(@RequestBody Client p
            , @RequestParam(value = "kdni", required = false) String kdni
            , @RequestParam(value = "dni", required = false) String dni) throws Exception {
        if (repo.findByKdniAndDni(kdni, dni).get().getDni().isEmpty()) {
            throw new Exception("Client doesn't find");
        }
        return repo.save(p);
    }

    @DeleteMapping()
    public void deleteClientbyId(@RequestParam(value = "id", required = false) Integer id) {
        repo.deleteById(id);
    }
}
