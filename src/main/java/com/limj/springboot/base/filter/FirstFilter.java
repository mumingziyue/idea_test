package com.limj.springboot.base.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "firstFilter", urlPatterns = {"*.html","*.jsp"}, initParams = {
        @WebInitParam(name="",value="")
})
public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("*.html,*.jsp拦截范围.......");
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
        System.out.println(httpServletRequest.getContextPath());
        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest.getRequestURL());
    }
}
