package com.wulang.great.haha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DouBanController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String hello(){
        return "hi";
    }
}

