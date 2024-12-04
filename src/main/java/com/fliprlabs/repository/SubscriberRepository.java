package com.fliprlabs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fliprlabs.model.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {

    Optional<Subscriber> findByEmail(String email);

    boolean existsByEmail(String email);

    


}

