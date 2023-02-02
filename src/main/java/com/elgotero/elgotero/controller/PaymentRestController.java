package com.elgotero.elgotero.controller;

import com.elgotero.elgotero.model.Payment;
import com.elgotero.elgotero.repository.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Payments")
public class PaymentRestController {
    @Autowired
    IPaymentRepository repo;

    @GetMapping
    public List<Payment> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Payment getAllyId(@PathVariable Integer id) {
        return repo.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Payment insertCredit(@RequestBody Payment p) {
        return repo.save(p);
    }

    @PutMapping
    public Payment modifyCredit(@RequestBody Payment p
            , @RequestParam(value = "id", required = false) Integer id) throws Exception {
        if (repo.findById(id).get().getId() < 1) {
            throw new Exception("Payment doesn't find");
        }
        return repo.save(p);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCreditbyId(@RequestParam(value = "id", required = false) Integer id) {
        repo.deleteById(id);
    }
}
