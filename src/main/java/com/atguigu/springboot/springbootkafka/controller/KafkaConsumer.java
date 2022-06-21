package com.atguigu.springboot.springbootkafka.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = "first",groupId = "atguigu")
    public void consumerTopic(String msg){
        System.out.println("收到消息：" + msg);
    }

}
