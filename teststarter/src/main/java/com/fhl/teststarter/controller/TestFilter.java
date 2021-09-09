//package com.fhl.teststarter.controller;
//
//
//import com.alibaba.fastjson.JSON;
//import lombok.extern.slf4j.Slf4j;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
//@Slf4j
//@WebFilter(filterName = "TestFilter", urlPatterns = { "/*" })
//public class TestFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("过滤器创建");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        System.out.println("hello我的拦截器");
//        log.info("url={}, params={}", req.getRequestURI(), JSON.toJSONString(req.getParameterMap()));
//        filterChain.doFilter(req, servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("过滤器撤销");
//    }
//}
