本例中对数据校验异常,在全局异常中做了处理
1:  引入依赖
            <!--spring数据校验-->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-validation</artifactId>
            </dependency>
            <dependency>
                <groupId>org.hibernate.validator</groupId>
                <artifactId>hibernate-validator</artifactId>
            </dependency>
2:  在实体类的字段上加上注解
    同一实体类,不同业务需要不同数据校验方式,可以分组校验
    需要在 Controller 入参的时候指定分组