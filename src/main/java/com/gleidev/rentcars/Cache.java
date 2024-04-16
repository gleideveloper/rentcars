package com.gleidev.rentcars;

import com.gleidev.rentcars.service.MessagingService;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private final List<MessagingService> services = new ArrayList<>();

    public MessagingService getService(String serviceName) {
        for (MessagingService service: services) {
            if (service.getServiceName().equalsIgnoreCase(serviceName)) {
                return service;
            }
        }
        return null;
    }

    public void addService(MessagingService newService) {
        services.add(newService);
    }
}
