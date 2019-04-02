package com.cishi.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribon")
public class RibonHandler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/index")
    public String index(){
        //直接通过服务名访问
//        return restTemplate.getForObject("http://userprovider/user/getport",String.class);
        //启动网关后 通过网关启动
        //网关/服务提供者/具体的业务类/具体的业务方法
        return restTemplate.getForObject("http://gateway/p/user/getport",String.class);
    }
}
