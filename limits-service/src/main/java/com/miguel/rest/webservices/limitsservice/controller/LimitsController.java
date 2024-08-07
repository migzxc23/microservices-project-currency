package com.miguel.rest.webservices.limitsservice.controller;

import com.miguel.rest.webservices.limitsservice.bean.Limits;
import com.miguel.rest.webservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    // pickup the values from application.properties

    @Autowired
    private Configuration configuration;

    @GetMapping(path = "/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
