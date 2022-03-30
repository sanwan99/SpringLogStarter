package com.fhl.teststarter.controller;

import com.github.jaemon.dinger.DingerSender;
import com.github.jaemon.dinger.core.entity.DingerRequest;
import com.github.jaemon.dinger.core.entity.enums.MessageSubType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskUtil {

    @Autowired
    private DingerSender dingerSender;

    @Scheduled(cron ="0 0 18 * * ?" )
    public void XB(){
        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request("下班啦下班啦！","下班提醒")
        );
        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request("噢sorry，是三万下班时间，点点可没下班","QAQ")
        );
    }

    @Scheduled(cron ="0 0 10 18 * ?" )
    public void JNR(){
        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request("今天是什么日子呀！","无奖竞猜")
        );
    }

    @Scheduled(cron ="0 45 11 ? * THU" )
    public void KFC(){
        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request("快过来楼下等我！","KFC之日")
        );
    }

    @Scheduled(cron ="0 59 10 18 * ?" )
    public void ELM(){
        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request("吃货豆！没准可以换奶茶","饿了么")
        );
    }
}
