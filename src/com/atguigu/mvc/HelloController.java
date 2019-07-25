package com.atguigu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangcheng
 * @create 2019-07-25 9:49
 */

@Controller
public class HelloController {

    @RequestMapping("/hello.form")
    public String hello(){
        System.out.println("MVC");
        return "hello";
    }
}
