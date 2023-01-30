package com.elgotero.elgotero.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEG_RISK")
public class Risk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "DS_DESCRIPTION", nullable = false)
    private String dsDescription;

    @Column(name = "DS_SHORT_NAME", nullable = false)
    private String dsShortName;
}
