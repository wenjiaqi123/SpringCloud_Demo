package com.gsm.config;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.ContentTypeDelegatingMessageConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消息队列基础配置
 * 配置序列化等
 */
@Configuration
public class RabbitMQConfig {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 传输序列化对象
     * @return
     */
    @Bean
    public MessageConverter messageConverter(){
        Jackson2JsonMessageConverter jsonMessageConverter = new Jackson2JsonMessageConverter();
        ContentTypeDelegatingMessageConverter converter = new ContentTypeDelegatingMessageConverter(jsonMessageConverter);
        return converter;
    }

    /**
     * 传输序列化对象
     * @return
     */
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory){
        //序列化对象
        Jackson2JsonMessageConverter jsonMessageConverter = new Jackson2JsonMessageConverter();
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter);
        return rabbitTemplate;
    }
}
