1:  引入依赖
        <!-- RabbitMQ 消息队列-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
        </dependency>
2:  配置文件
spring:
  rabbitmq:
    host: 127.0.0.1
    port: 5672
    username: guest
    password: guest
3:  编写配置类
        声明交换机,声明队列,绑定  详情见 config.DemoConfig
        如果是复杂类型,序列化内容   详情见 config.RabbitMQConfig
4:  发送消息
        详情见 service.impl.RabbitMQServiceImpl
5:  消费者消费
        详情见 consumer.RabbitMQConsumer