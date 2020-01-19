package com.wxz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/order")
public class OrderHandler {



    @GetMapping("/index")
    public String index(){
        return "order的端⼝：";
    }
}
