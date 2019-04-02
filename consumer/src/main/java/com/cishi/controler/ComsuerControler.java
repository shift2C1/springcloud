package com.cishi.controler;


import com.cishi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/consumer")
@Controller
public class ComsuerControler {
    //加入网关后添加的
    @Value("${server.port}")
    private String port;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getuser")
    @ResponseBody
    public User getUser(){
        //失败:添加responsebody才可以
        return restTemplate.getForEntity("http://localhost:8011/user/getuser", User.class).getBody();

        //成功
//        return "redirect:http://localhost:8011/user/getuser";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
