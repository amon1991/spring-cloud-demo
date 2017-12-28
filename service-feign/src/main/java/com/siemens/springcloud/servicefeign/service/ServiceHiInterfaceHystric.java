package com.siemens.springcloud.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/10/23.
 */
@Component
public class ServiceHiInterfaceHystric implements ServiceHiInterface {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
