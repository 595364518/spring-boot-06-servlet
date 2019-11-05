package com.mengxuegu.springboot.config;

import com.mengxuegu.springboot.filter.MyFilter;
import com.mengxuegu.springboot.listener.MyListener;
import com.mengxuegu.springboot.servlet.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import java.util.Arrays;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:06 2019/11/3
 */
@Configuration
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean helloServlet(){
        ServletRegistrationBean bean =
                new ServletRegistrationBean(new HelloServlet(), "/hello");
        bean.setLoadOnStartup(1);
        return bean;
    }
    @Bean
    public FilterRegistrationBean myFilter(){

        FilterRegistrationBean bean = new FilterRegistrationBean(new MyFilter());
        bean.setUrlPatterns(Arrays.asList("/hello"));
        return bean;
    }
    @Bean
    public ServletListenerRegistrationBean myListener(){

        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new MyListener());
        return bean;
    }
}
