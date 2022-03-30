package com.fhl.logtestspringbootstarter.config;

import javax.servlet.http.HttpServletRequest;

public interface logSessionProvider {

    logSession getlogSession(HttpServletRequest request);
}
