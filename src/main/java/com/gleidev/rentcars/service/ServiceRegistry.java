package com.gleidev.rentcars.service;


public interface ServiceRegistry {
    <T> ServiceAdapter<T> getService(String serviceName);
}
