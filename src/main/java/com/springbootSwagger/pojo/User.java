package com.springbootSwagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体") // @ApiModel 给生成的文档加注释   @ApiModelProperty给字段加注解
public class User {

    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("密码")
    public String password;
}