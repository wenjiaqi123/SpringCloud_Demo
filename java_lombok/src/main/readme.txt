1:  引入依赖
2:  在 bean 里加上注解
    @Data               相当于 set get 等
    @NoArgsConstructor  相当于 无参构造
    @AllArgsConstructor 相当于 全参构造
    @Builder            相当于 建造者模式       User user = User.builder().name().age().build();