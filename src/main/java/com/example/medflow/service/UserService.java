package com.example.medflow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.medflow.repository.mapper.UserMapper;
import com.example.medflow.repository.po.UserPO;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<UserPO> {

}
