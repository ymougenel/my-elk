package com.ymougenel.sandboxelk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TicTacController {

    private Logger logger = LoggerFactory.getLogger(TicTacController.class);

    @RequestMapping("/tic")
    public String tic() {
        logger.info("tic");
        return "tic";
    }
}
