package com.fliprlabs.service;

import org.springframework.stereotype.Service;

import com.fliprlabs.model.Subscriber;
import com.fliprlabs.repository.SubscriberRepository;

@Service
public class SubscriberService {
    private final SubscriberRepository repository;

    public SubscriberService(SubscriberRepository repository) {
        this.repository = repository;
    }

    public Subscriber saveSubscriber(Subscriber subscriber) {
        return repository.save(subscriber);
    }

   
}
