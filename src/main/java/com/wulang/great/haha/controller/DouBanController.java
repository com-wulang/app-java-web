package com.wulang.great.haha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DouBanController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value="/HelloWorld.vue",produces="text/plain")
    @ResponseBody
    public String HelloWorld(){
        return "";
    }

    @RequestMapping(value="/hi",produces="text/plain")
    @ResponseBody
    public String hello(){
        return "hi";
    }
}

