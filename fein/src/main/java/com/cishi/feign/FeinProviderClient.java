package com.cishi.feign;

import com.cishi.entity.User;
import com.cishi.feign.impl.FeinProviderimpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
//value:映射到服务提供者的服务名
//fallback:熔断后进入 该接口的实现类 ，通常是错误信息
@FeignClient(value = "userprovider",fallback = FeinProviderimpl.class)
public interface FeinProviderClient {
    @GetMapping("user/getuser")
    public User getuser();
    @GetMapping("user/getport")
    public String index();

}
