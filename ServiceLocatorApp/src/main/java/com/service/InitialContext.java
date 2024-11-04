package com.service;

public class InitialContext {
    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("ServiceA")) {
            System.out.println("Looking up and creating a new ServiceA object");
            return new ServiceA();
        } else if (serviceName.equalsIgnoreCase("ServiceB")) {
            System.out.println("Looking up and creating a new ServiceB object");
            return new ServiceB();
        }
        return null;
    }
}

