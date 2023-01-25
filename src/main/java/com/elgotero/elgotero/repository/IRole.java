package com.elgotero.elgotero.repository;

import com.elgotero.elgotero.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRole extends JpaRepository<Role, Integer> {
}
