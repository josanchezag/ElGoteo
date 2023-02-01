package com.elgotero.elgotero.controller;

import com.elgotero.elgotero.model.Credit;
import com.elgotero.elgotero.repository.ICreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Credits")
public class CreditRestController {
    @Autowired
    ICreditRepository repo;

    @GetMapping
    public List<Credit> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Credit getAllyId(@PathVariable Integer id) {
        return repo.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Credit insertCredit(@RequestBody Credit p) {
        return repo.save(p);
    }

    @PutMapping
    public Credit modifyCredit(@RequestBody Credit p
            , @RequestParam(value = "id", required = false) Integer id) throws Exception {
        if (repo.findById(id).get().getId() < 1) {
            throw new Exception("Client doesn't find");
        }
        return repo.save(p);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCreditbyId(@RequestParam(value = "id", required = false) Integer id) {
        repo.deleteById(id);
    }
}
