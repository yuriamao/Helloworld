package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HelloController {
    //http://localhost:8081/hello
    //@GetMapping("/hello")
    //change
    @RequestMapping(value = "/posttest1",method = RequestMethod.POST)
    //前端参数，昵称的
    public String Hello(@RequestParam(value = "id",required = false) String Nickname, String number){
        System.out.println(Nickname);
        return "链接成功 "+Nickname;
    }
}
