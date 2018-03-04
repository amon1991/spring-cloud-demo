package com.siemens.springcloud.serviceribbon.controller;

import com.siemens.springcloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/10/23.
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/commonHi")
    public String commonHi(@RequestParam String name) {
        return helloService.commonHiService(name);
    }

}
