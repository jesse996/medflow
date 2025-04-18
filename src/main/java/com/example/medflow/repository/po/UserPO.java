package com.example.medflow.repository.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_user")
public class UserPO {
    private Long id;
    private String name;
}
