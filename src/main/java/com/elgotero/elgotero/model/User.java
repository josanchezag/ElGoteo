package com.elgotero.elgotero.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEG_USERS")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DNI", nullable = false)
    private String dni;

    @Column(name = "DSCOMPLETENAME", nullable = false)
    private String dsCompleteName;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "DATESINGUP", nullable = false)
    private Date dateSingUp;

    @Column(name = "DATESINGDOWN" )
    private Date dateSignDown;

    @Column(name = "SNACTIVE", nullable = false)
    private String snActive;

    @ManyToOne
    @JoinColumn(name = "IDROLE", nullable = false)
    private Role role;


}
