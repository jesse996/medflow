package com.example.medflow.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.medflow.repository.po.UserPO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserPO> {
}
