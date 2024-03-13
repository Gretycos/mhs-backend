package com.mhs.common.mq;

import com.mhs.common.exception.MHSException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @Author Tsong
 * @Date 13/03/2024 21:16
 */
@Component
@Slf4j
public class MessageHandler {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String exchange, String routingKey, Object data) throws MHSException{
        // 准备CorrelationData
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        // 处理confirm
        correlationData.getFuture().whenComplete((confirm, throwable) -> {
            if (throwable == null){
                if (confirm.isAck()){
                    // ACK
                    log.debug("Succeeded to send the msg to the exchange! Msg ID: {}", correlationData.getId());
                } else {
                    // NACK
                    log.error("Failed to send the msg to the exchange! Msg ID: {}", correlationData.getId());
                    MHSException.fail("Failed to send the msg to the exchange");
                }
            } else {
                log.error("Failed to send the msg! {}", throwable.getMessage());
                MHSException.fail("Failed to send the msg");
            }
        });
        rabbitTemplate.convertAndSend(exchange, routingKey, data, correlationData);
    }
}
