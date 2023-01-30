package com.elgotero.elgotero.repository;

import com.elgotero.elgotero.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@Qualifier("client")
public interface IClientRepository extends JpaRepository<Client, Integer> {
}
