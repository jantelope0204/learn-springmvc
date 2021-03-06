package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/h")
    public String sayHello(Model model){
        System.out.println("=========================================121");
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC");
        return "hello";
    }
}
