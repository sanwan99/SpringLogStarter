package com.fhl.teststarter.controller;

import com.github.jaemon.dinger.DingerSender;
import com.github.jaemon.dinger.core.entity.DingerRequest;
import com.github.jaemon.dinger.core.entity.enums.MessageSubType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DingTalk {
    @Autowired
    private DingerSender dingerSender;
    @GetMapping("/MSG")
    public String MSG(@RequestParam("msg") String msg){

        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request(msg,"机器人自言自语")
        );

        return "MSG";
    }
    @GetMapping("/MYSL")
    public String MYSL(){

        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request("点点同志，速速前去蚂蚁森林浇水水！","蚂蚁森林")
        );

        return "MYSL";
    }
    @GetMapping("/MYSL1")
    public String MYSL1(){

        dingerSender.send(
                MessageSubType.MARKDOWN,
                DingerRequest.request("你能量被我偷完了，快去收能量嘿嘿！","蚂蚁森林")
        );

        return "收能量";
    }


}
