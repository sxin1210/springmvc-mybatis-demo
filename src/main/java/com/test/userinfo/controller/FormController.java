package com.test.userinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by songxin07 on 17/6/20.
 */
@Controller
public class FormController {

//    @PathVariable将URL中的变量{formName}绑定到注解的同名参数上
    @RequestMapping(value="/{formName}", method = RequestMethod.GET)
    public String loginForm(@PathVariable String formName){
        // 实现了动态跳转页面
        return formName;
    }
}

