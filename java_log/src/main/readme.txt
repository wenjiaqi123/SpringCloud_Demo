1:  SpringBoot自带日志依赖
2:  配置文件 可以使用 yml 配置,也可以使用 logback-spring.xml
3:  可以使用 public static Logger log = LoggerFactory.getLogger(LogApplication.class); 引入
    如果使用了 lombok 也可以在类上加注解 @Slf4j
        log.info();
        log.debug();
        log.error();