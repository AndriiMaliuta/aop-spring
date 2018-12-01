package com.bh.aop.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {

    public String getFortune() {

        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        return "Expect Heavy traffic this morning";
    }
}