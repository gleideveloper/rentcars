package com.gleidev.rentcars.service.impl;

import com.gleidev.rentcars.service.MessagingService;

public class EmailService implements MessagingService {
    @Override
    public String getMessageBody() {
        return "email message";
    }

    @Override
    public String getServiceName() {
        return "EmailService";
    }
}
