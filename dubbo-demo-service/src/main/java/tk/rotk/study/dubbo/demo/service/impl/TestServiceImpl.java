package tk.rotk.study.dubbo.demo.service.impl;

import tk.rotk.study.dubbo.demo.api.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
