package com.shuai.spring_boot_1.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shuai.spring_boot_1.service.UserService;

@Controller
public class OneController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;
    
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        
        userService.insert();
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        System.out.println("222222");
        System.out.println("44444");
        System.out.println("55555");
        System.out.println("66666");
        System.out.println("77777");
        return "hello spring boot";
    }
}