//package com.fhl.logtestspringbootstarter.config;
//
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.util.Assert;
//
//public class SpringUtil implements ApplicationContextAware {
//
//    private static ApplicationContext applicationContext;
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        SpringUtil.applicationContext=applicationContext;
//    }
//    private static void checkApplication(){
//        Assert.notNull(applicationContext,"未初始化完毕");
//    }
//    public static ApplicationContext getApplicationContext(){
//        checkApplication();
//        return applicationContext;
//    }
//}
