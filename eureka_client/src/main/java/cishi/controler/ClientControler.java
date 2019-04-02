package cishi.controler;

import cishi.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class ClientControler {
    @GetMapping("/getuser")
    @ResponseBody
    public User getUser(){
        return new User(1,"张三");
    }
    //获得当前端口：配置文件中的server：port
    @Value("${server.port}")
    private String port;
    @GetMapping("/getport")
    @ResponseBody
    public String getPort(){
        //测试负载均衡：同一个服务名字，开启了不同的端口，提供同样的服务，zuul会自动负载均衡，
        //保证每个服务的访问数分担总的访问次数
        //例如这个例子中的：eureka application 和eureka application2 有同样的服务名字，担任一样的任务，但分担了任务
        return this.port;
    }

}
