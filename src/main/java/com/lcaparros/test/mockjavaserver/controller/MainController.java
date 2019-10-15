package com.lcaparros.test.mockjavaserver.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author lcaparros
 */

@RestController
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping(value = "/ping", produces = "text/plain; charset=utf-8")
    public String getPing()
    {
        logger.info("New GET request for endpoing /ping");
        return "pong";
    }
}
