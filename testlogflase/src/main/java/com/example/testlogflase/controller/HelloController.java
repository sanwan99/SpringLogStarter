package com.example.testlogflase.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

      log.info("info");
      log.debug("debug");
      log.warn("warn");
      log.error("error");
      log.trace("trace");
        MDC.put("SessionID","123456789");
        return "hello";
    }
}
