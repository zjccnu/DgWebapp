package org.ssm.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssm.demo.service.impl.UserServiceImpl;

import javax.annotation.Resource;

/**
 * Created by zjccnu on 2018/1/25.
 */
@Controller
@RequestMapping(value = "/user",method = RequestMethod.GET)
public class UserController {
    @Resource
    UserServiceImpl userService;
    @RequestMapping("/select")
    public String selectPassword(){
        if(userService.selectByUserName("测试").getUser_name().equals("测试"))
        return "/zj";
        else
        return null;
    }

    @RequestMapping(value = "hello.do",method = RequestMethod.GET)
    // 访问此方法的url路径/test/hello.do
    public String hello() {
        System.out.println("ttttt");
        return "index";
    }
}
