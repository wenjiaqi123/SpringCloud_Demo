在SSM的基础上,添加有关事务处理
本例中还举例了 utils 静态类中引入 service 资源
1:  引入依赖
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
        </dependency>
2:  编写事务有关内容,配置类【本例中采取配置类】或者配置文件