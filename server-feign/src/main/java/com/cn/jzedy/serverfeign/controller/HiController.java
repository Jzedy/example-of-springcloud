package com.cn.jzedy.serverfeign.controller;

import com.cn.jzedy.serverfeign.api.HiApiService;
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
    private HiApiService hiApiService;

    @RequestMapping(value = "/hi")
    public String hi(){
        return hiApiService.hi();
    }
}
