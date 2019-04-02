package com.cishi.feign.impl;

import com.cishi.entity.User;
import com.cishi.feign.FeinProviderClient;
import org.springframework.stereotype.Component;

//feign 自带熔断机制
///熔断之后会进入到该类
@Component
public class FeinProviderimpl implements FeinProviderClient {
    @Override
    public User getuser() {
        return null;
    }

    @Override
    public String index() {
        return "服务器在维护哦。。。。";
    }
}
