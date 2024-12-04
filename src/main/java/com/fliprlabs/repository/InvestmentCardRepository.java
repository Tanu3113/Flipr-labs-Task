package com.fliprlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fliprlabs.model.InvestmentCard;

public interface InvestmentCardRepository extends JpaRepository<InvestmentCard, Long> {
}
