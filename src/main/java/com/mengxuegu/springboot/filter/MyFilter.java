package com.mengxuegu.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 自定义Filter
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:12 2019/11/3
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 过滤完成");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter 初始化开始");
    }

    @Override
    public void destroy() {
        System.out.println("Filter 销毁");

    }
}
