package com.zj.shop.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zj.shop.service.IUserService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = IUserService.class)
public class IUserServiceImpl implements IUserService {
    @Override
    public String sayHello(String s) {
        return "Hello:"+s;
    }
}
