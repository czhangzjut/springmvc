package com.atguigu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangcheng
 * @create 2019-07-25 9:49
 */

@Controller
public class HelloController {

    @RequestMapping("/hello.form")
    public String hello(Model model){
        model.addAttribute("name"," it's the first time to see you.");
        model.addAttribute("url","http://www.atguigu.com/download.shtml#JavaSE");
        System.out.println("MVC");
        return "hello";
    }
}
