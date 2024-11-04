package com.service;

public class ServiceB implements Service {
    @Override
    public String getName() {
        return "ServiceB";
    }

    @Override
    public void execute() {
        System.out.println("Executing ServiceB");
    }
}
