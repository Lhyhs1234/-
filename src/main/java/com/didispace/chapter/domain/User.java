package com.didispace.chapter.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@TableName(value="users")
public class User {
    @TableId(type= IdType.AUTO)
    private Long id;
    //ApiModelProperty("日期")
    //private String data;
    @ApiModelProperty("用户姓名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("用户地址")
    private String address;
    @TableField(exist=false)
    private List<Book> bookList;

}