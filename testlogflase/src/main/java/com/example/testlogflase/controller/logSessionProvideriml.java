package com.example.testlogflase.controller;

import com.fhl.logtestspringbootstarter.config.logSession;
import com.fhl.logtestspringbootstarter.config.logSessionProvider;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Order(0)
@Component
public class logSessionProvideriml implements logSessionProvider {
    @Override
    public logSession getlogSession(HttpServletRequest request) {
        Random random = new Random();
        return (new logSessioniml.logSessionBuilder())
                .User("hello"+random.ints())
                .dbName("hellodb"+random.ints())
                .builder();
    }
}
