package com.fliprlabs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvestmentCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tag;
    private String image;
    private String title;
    private String location;
    private String description;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "get_price")
    private Double getPrice;

    private String securityType;
    private Integer investmentMultiple;
    private String maturity;
    private Double minInvestment;
}
