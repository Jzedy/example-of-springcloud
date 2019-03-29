package com.cn.jzedy.eurekaribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyin
 * @date 2019/3/28
 */
@Service
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(){
        return restTemplate.getForObject("http://SERVICE-HI/hi",String.class);
    }

    public String hiError(){
        return "sorry,error";
    }
}
