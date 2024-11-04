package com.service;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private static Map<String, Service> cache = new HashMap<>();

    public static Service getService(String serviceName) {
        Service service = cache.get(serviceName);

        if (service != null) {
            System.out.println("Returning cached " + serviceName + " object");
            return service;
        }

        InitialContext context = new InitialContext();
        Service newService = (Service) context.lookup(serviceName);
        if (newService != null) {
            cache.put(serviceName, newService);
        }
        return newService;
    }
}

