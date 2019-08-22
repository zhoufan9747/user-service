package com.springzhou.userservice.remote;

import com.springzhou.userservice.remote.fallHystrix.OrderRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "example", fallback = OrderRemoteHystrix.class)
public interface OrderRemote {
    @GetMapping("/order/getOrderPort")
    String getOrderPort();
}
