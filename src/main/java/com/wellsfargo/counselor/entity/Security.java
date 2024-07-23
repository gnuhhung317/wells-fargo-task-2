package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Double purchasePrice;
    @Column(nullable = false)
    private LocalDateTime purchaseDate;
    @Column(nullable = false)
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id",nullable = false)
    private Portfolio portfolio;





}
