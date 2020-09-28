1:  引入依赖
        <!--spring-boot-starter-data-redis-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>
2:  配置 yml
spring:
  redis:
    host: 127.0.0.1
    port: 6379
3:  编写配置类,详情见 config.RedisConfig
4:  具体业务