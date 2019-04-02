package com.cishi.controler;

import com.cishi.FeignApplication;
import com.cishi.entity.User;
import com.cishi.feign.FeinProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignControler {
    @Autowired
    private FeinProviderClient feinProviderClient;

//    通过接口来获得所要的数据
    @GetMapping("/getuser")
    public User getuser(){
        return feinProviderClient.getuser();
    }
    @GetMapping("/index")
    public String index(){
        return feinProviderClient.index();
    }


}
