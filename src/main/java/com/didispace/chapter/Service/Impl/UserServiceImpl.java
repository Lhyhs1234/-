package com.didispace.chapter.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.didispace.chapter.Mapper.UserMapper;
import com.didispace.chapter.Service.UserService;
import com.didispace.chapter.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
