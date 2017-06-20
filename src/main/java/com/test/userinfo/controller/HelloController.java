package com.test.userinfo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by songxin07 on 17/6/16.
 */
@Controller
@RequestMapping("/mvc")
public class HelloController {
    private static final Log logger = LogFactory.getLog(HelloController.class);
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
