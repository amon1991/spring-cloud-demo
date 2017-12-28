package com.siemens.springcloud.servicefeign.controller;

import com.siemens.springcloud.servicefeign.service.ServiceHiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/10/23.
 */
@RestController
public class HiController {

    @Autowired
    private ServiceHiInterface serviceHiInterface;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return serviceHiInterface.sayHiFromClientOne(name);
    }

}
