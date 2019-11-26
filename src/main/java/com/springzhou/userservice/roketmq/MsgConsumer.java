package com.springzhou.userservice.roketmq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author zhou
 * @create 2019-11-25 16:06
 * @description:
 */
@Service
@RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "my-consumer_test-topic-1")
public class MsgConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        System.out.println("收到消息:"+message+"!!!!!");
        System.out.println("成功消费！！！！！！");
    }
}