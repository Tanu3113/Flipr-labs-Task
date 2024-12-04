package com.fliprlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fliprlabs.service.SubscriberService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080") // Adjust for frontend port
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    
}