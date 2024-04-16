package com.gleidev.rentcars.service;

import com.gleidev.rentcars.Cache;
import com.gleidev.rentcars.InitialContext;

public class ServiceLocator {
    private static final Cache cache = new Cache();

    public static MessagingService getService(String serviceName) {

        MessagingService service = cache.getService(serviceName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        MessagingService service1 = (MessagingService) context
                .lookup(serviceName);
        cache.addService(service1);
        return service1;
    }
}
