package com.springzhou.userservice.remote.fallHystrix;

import com.springzhou.userservice.remote.OrderRemote;
import org.springframework.stereotype.Component;

/**
 * @author zhou
 * @create 2019-08-19 16:57
 * @description:
 */
@Component
public class OrderRemoteHystrix implements OrderRemote {

    @Override
    public String getOrderPort() {
        return "order service 调用失败！";
    }
}