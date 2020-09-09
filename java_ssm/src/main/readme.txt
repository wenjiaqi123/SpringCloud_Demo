1:  引入依赖    数据库驱动,Mybatis依赖,连接池
2:  启动类上加上注解 @MapperScan("com.gsm.dao"),不加的话需要在 dao 层下面每个接口都要加 @Repository
3:  配置yml
                #####################################################################
                spring:
                  # 数据库连接配置,4个配置【驱动】【连接url】【数据库登录用户】【用户密码】
                  datasource:
                    driver-class-name: com.mysql.jdbc.Driver
                    url: jdbc:mysql://cdb-jwd16kdk.bj.tencentcdb.com:10069/wyxjava?useSSL=false&allowMultiQueries=true&autoReconnect=true&serverTimezone=Asia/Shanghai&characterEncoding=UTF-8
                    username: root
                    password: wyxjava123
                #####################################################################
                mybatis:
                  # 别名包,该包名下的实体类在 Mapper 里可以直接写类名
                  type-aliases-package: com.gsm.entity
                  # 指定 mapper 位置, classpath 指代的是 编译过后的 target 包下 classes
                  mapper-locations: classpath:com/gsm/dao/*Mapper.xml
                  configuration:
                    # 首字母大小写转换
                    map-underscore-to-camel-case: true
                # log日志等级,mybatis打印sql
                logging:
                  level:
                    com.gsm.dao: DEBUG
                #####################################################################
4:  如果 Mapper文件在 dao 层下,需要在 pom 文件里加上
                    <build>
                        <!--配置src/main/java 可以引入 xml-->
                        <resources>
                            <resource>
                                <directory>src/main/java</directory>
                                <includes>
                                    <include>**/*.xml</include>
                                </includes>
                            </resource>
                            <resource>
                                <directory>src/main/resources</directory>
                                <includes>
                                    <include>**/*.xml</include>
                                    <include>**/*.properties</include>
                                    <include>**/*.yml</include>
                                    <include>**/*.html</include>
                                </includes>
                            </resource>
                        </resources>
                    </build>

     如果 Mapper 文件在 resources 下新建 mapper 文件夹,
        java
            com.gsm
                controller
                dao
                    DemoDao
                    DemoMapper.xml
                service
                SSMApplication【启动类】
        resources
            mapper
                DemoMapper.xml

        classpath后面跟的路径,编译过后的 target 包下 classes
        yml 中 mybatis 下 mapper-locations: classpath:mapper/*.xml