package com.cn.jzedy.eurekaribbon.controller;

import com.cn.jzedy.eurekaribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyin
 * @date 2019/3/28
 */
@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @RequestMapping(value = "/hi")
    public String hi(){
        return hiService.hi();
    }
}
