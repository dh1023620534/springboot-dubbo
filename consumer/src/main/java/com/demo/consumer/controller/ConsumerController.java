package com.demo.consumer.controller;

import com.demo.service.TestProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Reference
    private TestProviderService testProviderService;

    @RequestMapping("init")
    public void init(){
        testProviderService.init();
    }

    @RequestMapping("registry")
    public void registry(){
        testProviderService.registry();
    }

    @RequestMapping("use")
    public void use(){
        testProviderService.use();
    }

    @RequestMapping("destroy")
    public void destroy(){
        testProviderService.destroy();
    }
}
