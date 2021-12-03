package com.fhl.logtestspringbootstarter.config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "log")
public class plumelogProperties {

        private String appName;
        private String redisHost;
        private String env;
        private String redisAuth="";
    }

