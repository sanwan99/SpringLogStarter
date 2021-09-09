package cn.newgrand.sup.config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "log")
public class plumelogProperties {

        private String appName;
        private String redisHost;
        private String env;
    }

