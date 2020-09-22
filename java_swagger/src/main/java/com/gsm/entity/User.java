package com.gsm.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Data = set      get     equal   hashCode    toString
 * @AllArgsConstructor  构造器
 * @NoArgsConstructor   空构造器
 * @Builder 建造者模式
 * @ApiModel()     @ApiOperation() 使用在 javaBean 上，说明该 javaBean 的作用
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("用户对象模型")
public class User {
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "用户年龄")
    private Integer age;
}
