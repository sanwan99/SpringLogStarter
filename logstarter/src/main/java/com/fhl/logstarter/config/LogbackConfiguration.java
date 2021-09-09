package com.fhl.logstarter.config;


import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.filter.ThresholdFilter;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import com.plumelog.logback.appender.RedisAppender;
import org.slf4j.Marker;
import org.slf4j.impl.StaticLoggerBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class LogbackConfiguration {

        private final LoggerContext ctx = (LoggerContext) StaticLoggerBinder.getSingleton().getLoggerFactory();
        @Autowired
        plumelogProperties plumelogProperties =new plumelogProperties();
        @Bean
        public void initRedisAppender(){
            RedisAppender redisAppender =new RedisAppender();
            redisAppender.setContext(ctx);
            ThresholdFilter filter = new ThresholdFilter();
            filter.setLevel(Level.INFO.levelStr);
            filter.start();
            redisAppender.addFilter(filter);
            redisAppender.setAppName( plumelogProperties.getAppname());
            redisAppender.setRedisHost(plumelogProperties.getRedisHost());
            redisAppender.start();
            ctx.addTurboFilter(new TurboFilter() {
                @Override
                public FilterReply decide(Marker marker, ch.qos.logback.classic.Logger logger, Level level, String format, Object[] params, Throwable t) {
                    logger.addAppender(redisAppender);
                    return FilterReply.NEUTRAL;
                }
            });

    }
}
