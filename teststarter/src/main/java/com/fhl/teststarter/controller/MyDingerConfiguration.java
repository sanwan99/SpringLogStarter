package com.fhl.teststarter.controller;

import com.github.jaemon.dinger.support.CustomMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.MessageFormat;
import java.util.Date;

@Configuration
public class MyDingerConfiguration {

    // 自定义text类型消息体，仅限手动发送功能，不适用于xml标签或注解统一管理消息体功能
    @Bean
    public CustomMessage textMessage() {
        Date date=new Date();
        return (projectId, request) ->
                MessageFormat.format(
                        "【三万大人通知】 \n- 内容: {1}.",
                        projectId, request.getContent());
    }
    @Bean
    public CustomMessage markDownMessage() {
        return (projectId, request) ->
                MessageFormat.format(
                        "#### 【闲得无聊开发的没啥用通知机器人】 : {2}\n- 内容: {1}",
                        projectId, request.getContent(),request.getTitle());
    }

}