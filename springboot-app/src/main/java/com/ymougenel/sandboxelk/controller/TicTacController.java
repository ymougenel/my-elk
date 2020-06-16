package com.ymougenel.sandboxelk.controller;

import com.ymougenel.sandboxelk.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TicTacController {

    private Logger logger = LoggerFactory.getLogger(TicTacController.class);

    @Autowired
    private Service service;

    @RequestMapping("/tic")
    public String tic() {
        logger.info("tic");
        return "tic";
    }

    @RequestMapping("/tac")
    public String tac() {
        logger.info("tac");
        return service.tac();
    }
}
