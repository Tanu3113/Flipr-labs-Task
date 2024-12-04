package com.fliprlabs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fliprlabs.model.InvestmentCard;
import com.fliprlabs.repository.InvestmentCardRepository;

@Service
public class InvestmentCardService {
    private final InvestmentCardRepository repository;

    public InvestmentCardService(InvestmentCardRepository repository) {
        this.repository = repository;
    }

    public List<InvestmentCard> getAllCards() {
        return repository.findAll();
    }

    public InvestmentCard addCard(InvestmentCard card) {
        return repository.save(card);
    }

    public void deleteCard(Long id) {
        repository.deleteById(id);
    }
}
