package com.gsm.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 声明一组【交换机,队列,绑定】
 * 声明交换机
 * 声明队列
 * 绑定交换机与队列
 */
@Configuration
public class DemoConfig {

    @Bean
    public FanoutExchange fanoutExchange0(){
        /**
         * 交换机类型
         * DirectExchange
         * TopicExchange
         * HeadersExchange
         * FanoutExchange
         */
        FanoutExchange fanoutExchange = new FanoutExchange("fff");
        return fanoutExchange;
    }

    @Bean
    public Queue queue0(){
        /**
         * String name                      队列名称
         * boolean durable                  默认true,是否持久化消息队列 ,rabbitmq重启的时候不需要创建新的队列
         * boolean exclusive                默认false,表示该消息队列是否只在当前connection生效
         * boolean autoDelete               默认false,表示消息队列没有在使用时是否被自动删除，false表示没有在使用时不删除
         * Map<String, Object> arguments
         */
        return new Queue("qqq");
    }

    @Bean
    public Binding binding0(FanoutExchange fanoutExchange0, Queue queue0){
        Binding binding = BindingBuilder.bind(queue0).to(fanoutExchange0);
        return binding;
    }
}
