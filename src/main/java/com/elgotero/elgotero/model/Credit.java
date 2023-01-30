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
@Table(name = "TEG_CREDITS")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT", nullable = false)
    private Client client;

    @Column(name = "VLR_INITIAL", nullable = false)
    private Long vlrInitial;

    @Column(name = "VLR_CURRENT")
    private Long vlrCurrent;

    @Column(name = "VLR_INTEREST_RATE", nullable = false)
    private Long vlrInterstRate;

    @Column(name = "DATE_OPEN", nullable = false)
    private Date dateOpen;

    @Column(name = "DATE_END", nullable = false)
    private Date dateEnd;

    @Column(name = "SN_STATUS", nullable = false)
    private String snStatus;

    @Column(name = "SN_ACTIVATE", nullable = false)
    private String snActivate;


}
