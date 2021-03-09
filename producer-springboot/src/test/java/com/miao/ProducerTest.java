package com.miao;

import com.miao.rabbit.config.RabbitMqConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author miaoyin
 * @date 2021/3/9 - 17:25
 * @commet:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProducerTest {
    //1.注入RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSend(){

        rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME,"boot.haha","boot mq hello~~~");
    }
}
