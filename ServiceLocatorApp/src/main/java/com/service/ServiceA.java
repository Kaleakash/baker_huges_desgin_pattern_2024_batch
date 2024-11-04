package com.service;

public class ServiceA implements Service {
    @Override
    public String getName() {
        return "ServiceA";
    }

    @Override
    public void execute() {
        System.out.println("Executing ServiceA");
    }
}



