package com.elgotero.elgotero.repository;

import com.elgotero.elgotero.model.Credit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("credit")
public interface ICreditRepository extends JpaRepository<Credit, Integer> {
    public Optional<Credit> findById(Integer id);
}
