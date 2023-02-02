package com.elgotero.elgotero.repository;

import com.elgotero.elgotero.model.Credit;
import com.elgotero.elgotero.model.Payment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("payment")
public interface IPaymentRepository extends JpaRepository<Payment, Integer> {
    public Optional<Payment> findById(Integer id);
}
