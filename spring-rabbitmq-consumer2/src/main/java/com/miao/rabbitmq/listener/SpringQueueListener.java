package com.miao.rabbitmq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @author miaoyin
 * @date 2021/3/9 - 16:58
 * @commet:
 */
public class SpringQueueListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        //打印消息
        System.out.println(new String(message.getBody()));
    }
}