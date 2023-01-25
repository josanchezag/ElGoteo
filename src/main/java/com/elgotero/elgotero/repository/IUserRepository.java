package com.elgotero.elgotero.repository;

import com.elgotero.elgotero.model.Userg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository  extends JpaRepository<Userg, Integer> {
    public Optional<Userg> findOneByuserName(String userName);
}
