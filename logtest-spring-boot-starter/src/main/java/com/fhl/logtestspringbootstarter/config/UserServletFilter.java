package com.fhl.logtestspringbootstarter.config;


import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.Principal;

public class UserServletFilter implements Filter {

    private final String USER_KEY = "username";

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        MDC.put("test", "fhl");
        this.insertIntoMDC(request);

        try {
            chain.doFilter(request, response);
        } finally {
            MDC.clear();
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("拦截器创建");
    }


    /**
     * Register the user in the MDC under USER_KEY.
     *
     * @param username
     * @return true id the user can be successfully registered
     */
    private boolean registerUsername(String username) {
        if (username != null && username.trim().length() > 0) {
            MDC.put(USER_KEY, username);
            return true;
        }
        return false;
    }

    void insertIntoMDC(ServletRequest request) {
        MDC.put("req.remoteHost", request.getRemoteHost());
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            MDC.put("req.requestURI", httpServletRequest.getRequestURI());
            StringBuffer requestURL = httpServletRequest.getRequestURL();
            if (requestURL != null) {
                MDC.put("req.requestURL", requestURL.toString());
            }

            MDC.put("req.method", httpServletRequest.getMethod());
            MDC.put("req.queryString", httpServletRequest.getQueryString());
            MDC.put("req.userAgent", httpServletRequest.getHeader("User-Agent"));
            MDC.put("req.xForwardedFor", httpServletRequest.getHeader("X-Forwarded-For"));
        }
    }
}

