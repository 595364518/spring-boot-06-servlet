package com.mengxuegu.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 自定义Listener
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:19 2019/11/3
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("项目启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("项目退出");
    }
}
