package com.fhl.logstarter.config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "log")
@Component
public class plumelogProperties {

        private String appname;
        private String redisHost;
        private String env;
    }

