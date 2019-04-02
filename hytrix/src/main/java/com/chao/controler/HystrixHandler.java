package com.chao.controler;

import com.chao.feign.FeinProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hystrix")
@Controller
public class HystrixHandler {
    @Autowired
    private FeinProviderClient feinProviderClient;
    @ResponseBody
    @GetMapping("/index")
    public String index(){
        return feinProviderClient.index();
    }
}
