package com.elgotero.elgotero.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEG_CLIENTS")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column (name = "DS_NAME", nullable = false)
    private String dsName;

    @Column (name = "DS_LAST_NAME1", nullable = false)
    private String dsLastName1;

    @Column (name = "DS_LAST_NAME2")
    private String dsLastName2;

    @Column (name = "NUM_PHONE1", nullable = false)
    private Integer numPhone1;

    @Column (name = "NUM_PHONE")
    private Integer numPhone2;

    @Column (name = "EMAIL", nullable = false)
    private String email;

    @Column (name = "ADRESS", nullable  = false)
    private String adress;

    @Column (name = "BIRTHDATE")
    private Date birthDate;

    @Column (name = "SN_ACTIVE", nullable = false)
    private String snActive;





}
