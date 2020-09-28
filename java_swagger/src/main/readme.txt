1:  引入依赖
        <!-- swagger 简化API-->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>
        <!--解决 swagger 升级以后 NoSuchMethodError 错误-->
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>20.0</version>
            <scope>compile</scope>
        </dependency>
2:  编写配置类,详情见 config.SwaggerConfig
3:  在每个 Controller 的方法上,实体类上加上注解