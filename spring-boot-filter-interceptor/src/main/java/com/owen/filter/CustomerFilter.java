package com.owen.filter;

import javax.servlet.*;
import java.io.IOException;


public class CustomerFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("fileter启动了");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
