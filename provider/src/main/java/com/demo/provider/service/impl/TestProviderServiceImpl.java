package com.demo.provider.service.impl;

import com.demo.service.TestProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = TestProviderService.class)
public class TestProviderServiceImpl implements TestProviderService {
    @Override
    public void init() {
        System.out.println("初始化");
    }

    @Override
    public void registry() {
        System.out.println("注册");
    }

    @Override
    public void use() {
        System.out.println("使用");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
