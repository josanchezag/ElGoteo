package com.elgotero.elgotero.repository;

import com.elgotero.elgotero.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("client")
public interface IClientRepository extends JpaRepository<Client, Integer> {
    public Optional<Client> findByKdniAndDni(String kdni, String dni);
}
