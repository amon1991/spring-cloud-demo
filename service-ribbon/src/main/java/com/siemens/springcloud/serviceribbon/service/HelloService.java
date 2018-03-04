package com.siemens.springcloud.serviceribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/10/23.
 */
@Service
public class HelloService {

    @Resource(name = "ribbonRestTemplate")
    RestTemplate ribbonRestTemplate;

    @Resource(name = "commonRestTemplate")
    RestTemplate commonRestTemplate;

    /**
     * send restful request by ribbon interceptor
     * @param name
     * @return
     */
    public String hiService(String name) {
        return ribbonRestTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    /**
     * send restful request by common restTemplate
     * @param name
     * @return
     */
    public String commonHiService(String name) {
        return commonRestTemplate.getForObject("http://localhost:8762/hi?name="+name,String.class);
    }

}
