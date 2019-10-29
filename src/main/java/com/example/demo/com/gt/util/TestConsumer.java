package com.example.demo.com.gt.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/10/28.
 */
@Component
@Slf4j
public class TestConsumer {

//    @KafkaListener(topics = "goods_mylog")
//    public void listen(ConsumerRecord<?, ?> record) throws Exception{
//        //控制台打印send进来的信息
//        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
//
//    }




}
