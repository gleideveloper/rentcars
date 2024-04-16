package com.gleidev.rentcars.service;

public interface ServiceAdapter<T> {
    void process(T request);
}
