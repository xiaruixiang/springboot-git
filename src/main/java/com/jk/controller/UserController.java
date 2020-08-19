package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @program: springboot-git
 * @author: xrx
 * @created: 2020/08/19 11:46
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("hello")
    public void hello(){

    }
}
