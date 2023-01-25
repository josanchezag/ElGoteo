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
public class Userg {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "USERNAME", nullable = false)
    private String userName;

    @Column(name = "PASSWORD", nullable = false)
    private String pass;

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
