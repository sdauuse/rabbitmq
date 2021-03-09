package com.miao.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author miaoyin
 * @date 2021/3/9 - 15:42
 * @commet:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-rabbitmq-producer.xml")
public class SpringProducer {

    //    1.注入RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSpringProducer() {
        //2.通过rabbitTemplate发送消息
        rabbitTemplate.convertAndSend("spring_queue","hello spring-rabbit................");
    }


}
