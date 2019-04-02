package com.cishi.controler;

import com.cishi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@Controller
@RestController
@RequestMapping("/rest")
public class UserControler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getuser")
    public User getUser(){
        return restTemplate.getForEntity("http://localhost:8011/user/getuser",User.class).getBody();
//        return restTemplate.getForEntity("http://userprovider/user/getuser",User.class).getBody();
    }
}
