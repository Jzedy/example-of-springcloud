package com.cn.jzedy.serverfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangyin
 * @date 2019/3/28
 */
@FeignClient(name = "service-hi",fallback = HiApiService.HiApiServiceFallback.class)
public interface HiApiService {

    @RequestMapping(value = "/hi")
    String hi();

    @Component
    public class HiApiServiceFallback implements HiApiService {
        @Override
        public String hi() {
            return "error with feign";
        }
    }
}
