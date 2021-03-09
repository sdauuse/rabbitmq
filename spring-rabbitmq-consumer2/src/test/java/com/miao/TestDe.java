package com.miao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author miaoyin
 * @date 2021/3/9 - 16:59
 * @commet:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-consumer.xml")
public class TestDe {

    @Test
    public void test1(){
        boolean flag = true;
        while (true){

        }
    }
}
