package com.elgotero.elgotero.controller;

import com.elgotero.elgotero.model.Client;
import com.elgotero.elgotero.model.Userg;
import com.elgotero.elgotero.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UsergRestController {

    @Autowired
    IUserRepository repo;

    @GetMapping
    public List<Userg> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Userg insertClient(@RequestBody Userg p) {
        return repo.save(p);
    }

    @PutMapping
    public Userg modifyClient(@RequestBody Userg p) {
        return repo.save(p);
    }

    @DeleteMapping()
    public void deleteClientbyId(@RequestParam(value = "id", required = false) Integer id) {
        repo.deleteById(id);
    }

}
