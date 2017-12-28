package com.siemens.springcloud.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/10/23.
 */
@FeignClient(value = "service-hi",fallback=ServiceHiInterfaceHystric.class)
public interface ServiceHiInterface {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
