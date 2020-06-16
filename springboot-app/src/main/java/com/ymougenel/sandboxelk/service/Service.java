package com.ymougenel.sandboxelk.service;

@org.springframework.stereotype.Service
public class Service {
    public String tac() {
        throw new IndexOutOfBoundsException("Exception raised");
    }
}
