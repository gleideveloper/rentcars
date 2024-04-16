package com.gleidev.rentcars.service.impl;

import com.gleidev.rentcars.service.MessagingService;

public class SMSService implements MessagingService {
    @Override
    public String getMessageBody() {
        return "sms message";
    }

    @Override
    public String getServiceName() {
        return "SMSService";
    }
}
