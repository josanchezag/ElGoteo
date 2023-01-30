package com.elgotero.elgotero.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEG_PAYMENTS")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_CREDIT", nullable = false)
    private Credit credit;

    @Column(name = "VLR_PAYMENT_MADE", nullable = false)
    private Long vlrPaymentMade;

    @Column(name = "VLR_PAYMENT_LATE", nullable = false)
    private Long vlrPaymentlaTe;
}
