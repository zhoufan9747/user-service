package com.springzhou.userservice.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhou
 * @create 2019-11-26 15:55
 * @description:
 */

@Component
@RabbitListener(queues = "delay_process_queue")
public class MsgReceiver {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {
        logger.info("接收处理队列delay_process_queue当中的消息： " + content);
    }
}