package com.gsm.controller;

import com.gsm.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Api() 使用在 类 上，说明该 类 的作用
 */
@Api("用来测试 swagger")
@RestController
@RequestMapping("swagger")
public class SwaggerController {

    /**
     * @ApiOperation() 使用在 方法 上，说明该 方法 的作用
     * notes 可以添加说明，
     */
    @ApiOperation(value = "添加用户", notes = "user是用户")
    @PostMapping("demo")
    public User insertSth(@RequestBody User user) {
        System.out.println("user.name = " + user.getName());
        System.out.println("user.age = " + user.getAge());
        User u = User.builder()
                .name(user.getName())
                .age((int)(Math.random()*(100-1+1)+1))
                .build();
        return u;
    }


    /**
     * @ApiImplicitParam
     * paramType
     *      path    请求url路径中    示例中 name 与 url {} 中一致，和 形参 userId 没关系
     *      query   请求参数
     *      header  请求头
     *      body    请求体（不常用）
     *      form    （不常用）
     * @param userId
     * @return
     */
    @ApiOperation(value = "删除用户信息",notes = "根据用户id")
    @ApiImplicitParam(paramType = "path",name = "userId",value = "用户id",required = true,type = "int")
    @DeleteMapping("demo/{userId}")
    public String deleteSth(@PathVariable("userId") Integer userId) {
        System.out.println("id = " + userId);
        return "success";
    }

    @PutMapping("demo")
    public User updateSth(@RequestBody User user) {
        System.out.println("user.name = " + user.getName());
        System.out.println("user.age = " + user.getAge());
        User u = User.builder()
                .name(user.getName())
                .age(user.getAge() + (int) (Math.random() * (50 - 1 + 1) + 1))
                .build();
        return u;
    }

    @GetMapping("demo")
    public String getSth(String s) {
        System.out.println("s = " + s);
        return "success";
    }
}
