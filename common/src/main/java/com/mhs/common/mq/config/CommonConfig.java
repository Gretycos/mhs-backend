package com.mhs.common.mq.config;

import com.mhs.common.exception.MHSException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Tsong
 * @Date 13/03/2024 21:14
 */
@Configuration
@Slf4j
public class CommonConfig implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // 获取RabbitTemplate
        RabbitTemplate rabbitTemplate = applicationContext.getBean(RabbitTemplate.class);
        // 配置ReturnsCallback
        rabbitTemplate.setReturnsCallback(returnedMessage -> {
            // 判断是否是延迟消息
            Long delay = returnedMessage.getMessage().getMessageProperties().getReceivedDelayLong();
            // 延迟消息，直接跳过
            if (delay!= null && delay > 0){
                return;
            }
            log.error("Failed to send message to queue. {}", returnedMessage);
            MHSException.fail("Failed to send message to queue");
        });
    }
}
