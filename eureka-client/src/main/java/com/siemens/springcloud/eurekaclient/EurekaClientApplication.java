package com.siemens.springcloud.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaClient
@RestController
/*@EnableHystrix
@EnableHystrixDashboard*/
public class EurekaClientApplication {

    private static final Logger LOG = Logger.getLogger(EurekaClientApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    /*@Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/traceHi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String traceHi(){
        LOG.log(Level.INFO, "traceHi: calling trace service-hi:miya  ");
        return restTemplate.getForObject("http://localhost:8762/miya", String.class);
    }

    @RequestMapping("/miya")
    public String miya(){
        LOG.log(Level.INFO, "miya: calling trace service-hi:myinfo  ");
        return restTemplate.getForObject("http://localhost:8762/myinfo", String.class);
    }*/

    /*@RequestMapping("/myinfo")
    public String info(){
        LOG.log(Level.INFO, "info: finished calling...  ");
        return "i'm service-hi";
    }*/

    /*public String hiError() {
        return "sorry,error!";
    }*/

}
