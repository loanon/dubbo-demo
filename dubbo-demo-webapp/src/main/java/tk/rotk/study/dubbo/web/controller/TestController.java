package tk.rotk.study.dubbo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.rotk.study.dubbo.demo.api.TestService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public Map<String,String> sayHello(String name){
        Map<String,String> map = new HashMap<>();
        map.put("result",testService.sayHello(name));
        return map;

    }
}
