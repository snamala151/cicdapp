package com.suryatech.cicdapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController
{
    Logger logger
            = LoggerFactory.getLogger(PingController.class);
    @GetMapping("/ping")
    public String hello(){
        logger.info("Ping controller is going to return the sample log message");
        return "Ping pong";
    }
}
