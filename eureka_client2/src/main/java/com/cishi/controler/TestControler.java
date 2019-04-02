package com.cishi.controler;

import com.cishi.entity.Clazz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/class")
public class TestControler {
    @GetMapping("/getclass")
    @ResponseBody
    public Clazz getClazz(){
        return new Clazz(2L,"2班");
    }
}
