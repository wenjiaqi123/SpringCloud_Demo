1:  引入依赖
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-test</artifactId>
            </dependency>
2:  在测试类上加上注解
            @RunWith(SpringRunner.class)
            @SpringBootTest
    在测试方法上加上注解
            @Test