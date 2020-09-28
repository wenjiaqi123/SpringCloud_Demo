1:  引入依赖
        <!--websocket 支持-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-websocket</artifactId>
        </dependency>
2:  编写配置类,详情见 config.WebSocketConfig
3:  编写 Socket 服务类,详情见 server.WebSocketServer
    注意点:
        3.1 类上注解,推送地址   @ServerEndpoint("/websocket/{sid}")
        3.2 推送
4: 一般会有一个触发条件,让 socket 推送给前端


前端: 这里使用的是原生 js 的方式开启 socket