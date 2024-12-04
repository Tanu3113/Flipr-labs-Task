package com.fliprlabs.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fliprlabs.model.InvestmentCard;
import com.fliprlabs.service.InvestmentCardService;

@RestController
@RequestMapping("/api/cards")
public class InvestmentCardController {
    private final InvestmentCardService service;

    public InvestmentCardController(InvestmentCardService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvestmentCard> getAllCards() {
        return service.getAllCards();
    }

    @PostMapping
    public InvestmentCard addCard(@RequestBody InvestmentCard card) {
        return service.addCard(card);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCard(@PathVariable Long id) {
        service.deleteCard(id);
        return ResponseEntity.ok("Card deleted successfully");
    }
}
