package com.gleidev.rentcars;

import com.gleidev.rentcars.service.impl.EmailService;
import com.gleidev.rentcars.service.impl.SMSService;

public class InitialContext {
    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailService")) {
            return new EmailService();
        } else if (serviceName.equalsIgnoreCase("SMSService")) {
            return new SMSService();
        }
        return null;
    }
}
